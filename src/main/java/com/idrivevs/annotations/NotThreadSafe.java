/**
 * Copyright 2016 idrive.com, Inc. or its affiliates. All Rights Reserved.
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
 *  This annotation defines the class as not thread safe.This means that
 *  sequences of accesses (reads and writes to public fields, calls to public methods)
 *  may put the object into an invalid state.
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) 
public @interface NotThreadSafe {

}
