package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author XiaoLOrange
 * @time 2020.12.29
 * @title
 */
@Target({ElementType.METHOD})
//@Retention(RetentionPolicy.SOURCE)
//@Retention(RetentionPolicy.CLASS)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnno {
}
