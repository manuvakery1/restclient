/**
 * 
 */
package com.idrivevs.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author idrive
 * <p>
 * This annotation defines the the objects of this classes are immutable. Which means the state
 * of the object can not be changed once created
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) 
public @interface Immutable {
	
	
}
