package analysis;

import java.lang.annotation.Annotation;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import tests.Test;
import annotations.sensitivities.ArrayComponentIndexSensitivity;
import annotations.sensitivities.ArrayComponentSensitivity;
import annotations.sensitivities.ContextSensitivity;
import annotations.sensitivities.FieldSensitivity;
import annotations.sensitivities.FlowSensitivity;
import annotations.sensitivities.ObjectSensitivity;
import annotations.sensitivities.PathSensitivity;
import annotations.sensitivities.context.CallsiteSensitivity;
import annotations.sensitivities.context.ParameterSensitivity;
import annotations.sensitivities.context.ReceiverSensitivity;
import annotations.sensitivities.paths.BranchSensitivity;
import annotations.sensitivities.paths.ExceptionSensitivity;
import annotations.sensitivities.paths.LoopSensitivity;
import annotations.sensitivities.paths.SwitchSensitivity;

public class MapTestAnnotations {

	public static void main(String[] args) {
		Set<Class<? extends Test>> testClasses = getTestClasses();

		for (Class<? extends Test> test : testClasses) {
			System.out.println(test.getSimpleName());
			Annotation[] annotations = test.getAnnotations();
			for (Annotation annotation : annotations) {
				System.out.println(annotation.annotationType().getSimpleName() + getAnnotationRationale(annotation));
			}
			System.out.println();
		}
	}
	
	private static String getAnnotationRationale(Annotation annotation){
		String result = "";
		
		// sensitivities
		if(annotation instanceof ArrayComponentIndexSensitivity){
			result = ((ArrayComponentIndexSensitivity) annotation).rationale();
		} else if(annotation instanceof ArrayComponentSensitivity){
			result = ((ArrayComponentSensitivity) annotation).rationale();
		} else if(annotation instanceof ContextSensitivity){
			result = ((ContextSensitivity) annotation).rationale();
		} else if(annotation instanceof FieldSensitivity){
			result = ((FieldSensitivity) annotation).rationale();
		} else if(annotation instanceof FlowSensitivity){
			result = ((FlowSensitivity) annotation).rationale();
		} else if(annotation instanceof ObjectSensitivity){
			result = ((ObjectSensitivity) annotation).rationale();
		} else if(annotation instanceof PathSensitivity){
			result = ((PathSensitivity) annotation).rationale();
		} 
		
		// specific context sensitivity requirements
		else if(annotation instanceof CallsiteSensitivity){
			result = ((CallsiteSensitivity) annotation).rationale();
		} else if(annotation instanceof ParameterSensitivity){
			result = ((ParameterSensitivity) annotation).rationale();
		} else if(annotation instanceof ReceiverSensitivity){
			result = ((ReceiverSensitivity) annotation).rationale();
		}
		
		// specific path sensitivities requirements
		else if(annotation instanceof BranchSensitivity){
			result = ((BranchSensitivity) annotation).rationale();
		} else if(annotation instanceof ExceptionSensitivity){
			result = ((ExceptionSensitivity) annotation).rationale();
		} else if(annotation instanceof LoopSensitivity){
			result = ((LoopSensitivity) annotation).rationale();
		} else if(annotation instanceof SwitchSensitivity){
			result = ((SwitchSensitivity) annotation).rationale();
		}
		
		if(!result.equals("")){
			result = ": " + result;
		}
		return result;
	}
	
	private static Set<Class<? extends Test>> getTestClasses(){
		Reflections.log = null; // turn off logging for reflections library
		
		List<ClassLoader> classLoadersList = new LinkedList<ClassLoader>();
		classLoadersList.add(ClasspathHelper.contextClassLoader());
		classLoadersList.add(ClasspathHelper.staticClassLoader());

		Reflections reflections = new Reflections(new ConfigurationBuilder()
		    .setScanners(new SubTypesScanner(false /* don't exclude Object.class */), new ResourcesScanner())
		    .setUrls(ClasspathHelper.forClassLoader(classLoadersList.toArray(new ClassLoader[0])))
		    .filterInputsBy(new FilterBuilder().include(FilterBuilder.prefix("test"))));

		
		Set<Class<? extends Test>> testClasses = reflections.getSubTypesOf(Test.class);
		
		return testClasses;
	}

}
