//package com.resilience4j.service_A.resilience4jConfig;
//
//import io.github.resilience4j.circuitbreaker.CircuitBreaker;
//import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
//import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.Duration;
//
//@Configuration
//public class Resilience4jConfiguration {
//
//    @Bean
//    public CircuitBreakerRegistry circuitBreakerRegistry(){
//        CircuitBreakerConfig config = CircuitBreakerConfig.custom()
//                .failureRateThreshold(50)                   // 50% failure threshold
//                .waitDurationInOpenState(Duration.ofSeconds(10)) // how long to stay open before retry
//                .slidingWindowSize(10)                      // number of calls to measure failure rate
//                .permittedNumberOfCallsInHalfOpenState(3)   // calls allowed in half-open state
//                .automaticTransitionFromOpenToHalfOpenEnabled(true)
//                .build();
//        return CircuitBreakerRegistry.of(config);
//    }
//
//    @Bean
//    public CircuitBreaker serviceACircuitBreaker(CircuitBreakerRegistry registry){
//        // Create or retrieve a circuit breaker named "backendA"
//        return registry.circuitBreaker("Service_A");
//    }
//}
