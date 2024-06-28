package com.isoft.mtax.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("mtax-service", r -> r.path("/mtax/**")
                        .uri("http://localhost:8082"))
                .route("portal-service",r ->r.path("/portal/**")
                        .uri("http://localhost:8084"))
                .route("notification-service", r -> r.path("/notification/**")
                        .uri("http://localhost:8086"))
                .build();
    }
}
