package annotations.sensitivities.paths;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)

public @interface BranchSensitivity {

	// optionally rationale may be provided to explain the annotation
	String rationale() default "";
	
}
