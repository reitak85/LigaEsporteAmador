/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ligadeesportearmador.util;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author rut1
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface GroupBeanMethodAttributes {

    /**
     * Alias for a method name.
     */
    String value();

    /**
     * Define if the method is a transient case.
     */
    boolean isTransient() default false;

}
