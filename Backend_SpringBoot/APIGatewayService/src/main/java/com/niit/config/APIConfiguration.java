package com.niit.config;

import com.niit.filter.JwtFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;

@Configuration
@CrossOrigin(origins = "*")
public class APIConfiguration {
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route(p->p
                        .path("/api/v1/**")
                        .uri("http://localhost:9002/"))
                .route(p->p
                        .path("/api/v2/**")
                        .uri("http://localhost:9003/"))
                .build();
    }

    @Bean
    public FilterRegistrationBean jwtFilterBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new JwtFilter());
        filterRegistrationBean.addUrlPatterns("/api/v2/**");
        return filterRegistrationBean;
    }
}
