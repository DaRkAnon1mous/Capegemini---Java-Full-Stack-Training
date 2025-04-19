package com.util;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
            .dataSource(dataSource)
            .passwordEncoder(NoOpPasswordEncoder.getInstance()) // No password encoding
            .usersByUsernameQuery("SELECT uname, pwd, enabled FROM login WHERE uname = ?") // Query to fetch username, password, and enabled status
            .authoritiesByUsernameQuery("SELECT uname, role FROM login WHERE uname = ?"); // Query to fetch username and role
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .anyRequest().authenticated() // Every request should be authenticated
                .and()
            .formLogin() // Enable form-based authentication
                .defaultSuccessUrl("/welcome", true) // Redirect to /welcome on successful login
                .and()
            .csrf().disable(); // Disable CSRF for simplicity (not recommended for production)
    }
}