package annotations.sensitivities;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)

public @interface ContextSensitivity {

	// optionally rationale may be provided to explain the annotation
	String rationale() default "";
	
	// required sensitivity level to solve test case
	int k() default 1;
}
