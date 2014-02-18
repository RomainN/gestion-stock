/**
 * 
 */
package net.blog.dev.gestion.stocks.back;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

/**
 * Evenement lancer une fois le contexte initialise
 * 
 * 
 * @author Kiva
 * 
 */
@Qualifier
@Target({ ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface InitApp {
}
