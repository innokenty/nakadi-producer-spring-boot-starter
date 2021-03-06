package org.zalando.nakadiproducer;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotate your Spring Boot Configuration with this annotation to trigger the Nakadi Producer autoconfiguration.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(NakadiProducerAutoConfiguration.class)
@Documented
public @interface EnableNakadiProducer {
}
