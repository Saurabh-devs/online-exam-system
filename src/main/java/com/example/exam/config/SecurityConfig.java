package com.example.exam.config;

import com.example.exam.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private CustomUserDetailsService userDetailsService;

    // -------- CHANGED PASSWORD ENCODER --------
    @Bean
    public static PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
    // -----------------------------------------

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests((authorize) ->
                        authorize
                                .requestMatchers("/js/**","/static/js/**", "/css/**", "/images/**", "/uploads/**").permitAll()

                                // Public pages
                                .requestMatchers("/", "/login", "/register", "/h2-console/**").permitAll()

                                // Admin pages
                                .requestMatchers("/admin/**").hasRole("ADMIN")

                                // Student pages
                                .requestMatchers("/student/**", "/exam/**").hasRole("STUDENT")

                                // All other requests need authentication
                                .anyRequest().authenticated()
                )
                .formLogin(
                        form -> form
                                .loginPage("/login")
                                .loginProcessingUrl("/login")
                                .failureUrl("/login?error=true")
                                .permitAll()
                )
                .logout(
                        logout -> logout
                                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                                .permitAll()
                )
                .userDetailsService(userDetailsService)

                // Required for H2 Console
                .headers(headers -> headers.frameOptions(frameOptions -> frameOptions.disable()));

        return http.build();
    }
}
