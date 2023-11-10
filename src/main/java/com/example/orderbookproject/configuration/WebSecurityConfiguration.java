// package com.example.orderbookproject.configuration;
//
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.Customizer;
// import
// org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import
// org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.crypto.factory.PasswordEncoderFactories;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
// import org.springframework.web.servlet.config.annotation.CorsRegistry;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
/// **
// * The type Web security configuration.
// */
// @Configuration
// @EnableWebSecurity
// public class WebSecurityConfiguration {
//
// /**
// * Password encoder password encoder.
// *
// * @return the password encoder
// */
// @Bean
// public PasswordEncoder passwordEncoder() {
// return PasswordEncoderFactories.createDelegatingPasswordEncoder();
// }
//
// @Bean
// public WebMvcConfigurer corsConfigurer() {
// return new WebMvcConfigurer() {
// @Override
// public void addCorsMappings(CorsRegistry registry) {
// registry.addMapping("/**")
// .allowedOrigins("*")
// .allowedMethods("GET", "PUT", "POST", "PATCH", "DELETE", "OPTIONS")
// .allowedHeaders("*");
// }
// };
// }
//
// @Bean
// SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
// http.authorizeHttpRequests((authentication) -> authentication
// .requestMatchers(AntPathRequestMatcher.antMatcher("/api/v1/users/signup")).authenticated()
// .anyRequest().permitAll());
//
// http.httpBasic(Customizer.withDefaults());
// http.csrf(csrf -> csrf.disable());
// return http.build();
// }
//
// }
//