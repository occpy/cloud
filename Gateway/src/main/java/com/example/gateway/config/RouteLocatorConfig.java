package com.example.gateway.config;


import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RouteLocatorConfig {

    @Bean
    public RouteLocator routeLocatorConfig(RouteLocatorBuilder  locatorBuilder) {
        final RouteLocatorBuilder.Builder builder = locatorBuilder.routes();
        builder.route(item -> item.path("/qq_39654841").uri("http://blog.csdn.net/"));
        return  builder.build();
    }
}
