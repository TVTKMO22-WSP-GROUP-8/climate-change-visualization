// File name: SecurityConfig.java
package group_8.climatechangebackend.security;

import group_8.climatechangebackend.services.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Value("${my.token}")
    private String hardcodedToken;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeRequests()
            .antMatchers("/error").permitAll()
            .antMatchers(HttpMethod.POST, "/api/user/register").permitAll()
            .antMatchers(HttpMethod.POST, "/api/user/login").permitAll()
            .antMatchers(HttpMethod.POST, "/api/user/userinfo").permitAll()
            .antMatchers(HttpMethod.GET, "/api/user/userinfo").permitAll()
            .antMatchers(HttpMethod.GET, "/api/northern-hemisphere-2000").permitAll()
            .antMatchers(HttpMethod.GET, "/api/**").permitAll()         
            .anyRequest().authenticated()
            .and()
            .addFilterBefore(new HardcodedTokenAuthenticationFilter(hardcodedToken), UsernamePasswordAuthenticationFilter.class);
    }


    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserDetailsService)
            .passwordEncoder(bCryptPasswordEncoder());
    }
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
    
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
