package com.mzs.securingweb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // // TODO Auto-generated method stub
        // super.configure(http);
        http
            .authorizeRequests()
                .antMatchers("/","/home").permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
            .logout()
                .permitAll();        
    }

    @Bean
    @Override
    protected UserDetailsService userDetailsService() {
        // // TODO Auto-generated method stub
        // return super.userDetailsService();
        UserDetails user=
                    User.withDefaultPasswordEncoder()
                        .username("mzs13")
                        .password("4mzs12")
                        .roles("USER")
                        .build();
        return new InMemoryUserDetailsManager(user);
    }
}
