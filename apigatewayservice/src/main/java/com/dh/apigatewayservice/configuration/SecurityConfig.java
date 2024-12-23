package com.dh.apigatewayservice.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class SecurityConfig {


    @Bean
    public SecurityWebFilterChain springSecurityFilterChain (ServerHttpSecurity http) {


        http
                .authorizeExchange()
                .anyExchange().authenticated()  // All requests need authentication
                .and()
                .oauth2Login();  // Use OAuth2 login for authentication


        return http.build();
    }
}


