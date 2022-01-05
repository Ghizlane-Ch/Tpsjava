package ma.eduction.tp6.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.Inherited;
import java.lang.annotation.RetentionPolicy;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface Programmer {
	abstract int id();
	String name();
}
