package annotations.sensitivities.context;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)

/**
 * Typically defined as a static abstraction of the parameters passed to the method
 * 
 * Reference: Lhotak 2008 Section 2.2
 */
public @interface ParameterSensitivity {

	// optionally rationale may be provided to explain the annotation
	String rationale() default "";
	
}
