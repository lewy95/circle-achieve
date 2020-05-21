package cn.xzxy.lewy.circleachieve.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface OpLog {
 
	/**
	 * 操作方法
	 */
	String methodCode();
 
	/**
	 * 操作名称
	 */
	String methodName();
 
}
