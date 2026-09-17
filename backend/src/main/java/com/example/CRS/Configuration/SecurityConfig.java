package com.example.CRS.Configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Autowired
    UserDetailsService userDetailsService;

    @Bean
    public SecurityFilterChain sfc(HttpSecurity http) throws Exception {

       return http.csrf(customizer-> customizer.disable())

                .cors(Customizer.withDefaults())

        .authorizeHttpRequests(request -> request
                .requestMatchers(
                        "/",
                        "/Course",
                        "/course/register",
                        "/admin/add-user",
                        "/admin/course-enroll"
                ).permitAll()
                .requestMatchers("/admin/**").hasRole("ADMIN")



//                .requestMatchers("user/**").hasAnyRole("ADMIN","USER")
//                .requestMatchers("/public/**").permitAll()
                .anyRequest().authenticated())
       // http.formLogin(Customizer.withDefaults());
         .httpBasic(Customizer.withDefaults())
        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
        .build();
    }
    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider daoAuth=new DaoAuthenticationProvider();
        daoAuth.setPasswordEncoder(new BCryptPasswordEncoder(12));
        daoAuth.setUserDetailsService(userDetailsService);
        return daoAuth;
    }

}
