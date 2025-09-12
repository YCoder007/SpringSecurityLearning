package com.yash.projects.Spring.security.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {




    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {


        // this is what we call method chaining
       return http
                .csrf(customizer -> customizer.disable())
        .authorizeHttpRequests(request -> request.anyRequest().authenticated())
//        http.formLogin(Customizer.withDefaults());
        .httpBasic(Customizer.withDefaults())
        .sessionManagement(sessions->sessions.sessionCreationPolicy(SessionCreationPolicy.STATELESS)).build();






    }

    @Bean
    public UserDetailsService userDetailsService(){

        UserDetails user1= User.withDefaultPasswordEncoder().username("Ojas").password("o123").roles("USER").build();

        UserDetails user2= User.withDefaultPasswordEncoder().username("WOW").password("w123").roles("Admin").build();

        return  new InMemoryUserDetailsManager(user1, user2);
    }

}
