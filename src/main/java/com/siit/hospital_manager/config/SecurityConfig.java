package com.siit.hospital_manager.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Value("${arrayOfPermitAllPathPatterns}")
    private String[] permitAllPaths;

    @Value("${arrayOfSecuredPathPatterns}")
    private String[] securedPaths;

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web -> web.ignoring().requestMatchers("/", "/public"));
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests()
                .requestMatchers(permitAllPaths).permitAll()
                .requestMatchers(securedPaths).hasAnyRole("PATIENT", "DOCTOR", "ADMIN")
                .requestMatchers("/**").hasRole("ADMIN")
                .and()
                .logout()
                .logoutSuccessUrl("/")
                .and()
                .formLogin()
                .and()
                .csrf().disable();
        return http.build();
    }

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

}