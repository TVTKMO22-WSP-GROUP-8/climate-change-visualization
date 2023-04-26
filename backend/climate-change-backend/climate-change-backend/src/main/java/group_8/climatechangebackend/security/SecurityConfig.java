package group_8.climatechangebackend.security;

import group_8.climatechangebackend.repositories.UserRepository;
import group_8.climatechangebackend.config.CustomAuthenticationSuccessHandler;
import group_8.climatechangebackend.jwt.JwtTokenFilter;
import group_8.climatechangebackend.jwt.JwtUtil;
import group_8.climatechangebackend.services.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    
    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;

    @Autowired
    @Lazy
    private CustomUserDetailsService customUserDetailsService;

    @Autowired
    public SecurityConfig(JwtUtil jwtUtil, UserRepository userRepository) {
        this.jwtUtil = jwtUtil;
        this.userRepository = userRepository;
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        JwtTokenFilter jwtTokenFilter = new JwtTokenFilter(jwtUtil, customUserDetailsService);

        http
            .csrf().disable()
            .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/api/user/register").permitAll()
                .antMatchers(HttpMethod.POST, "/api/user/login").permitAll()
                .antMatchers(HttpMethod.GET, "/api/**").permitAll()
                .anyRequest().authenticated()
            .and()
                .formLogin()
                    .loginProcessingUrl("/api/user/login")
                    .successHandler(new CustomAuthenticationSuccessHandler(jwtUtil))
                    .permitAll()
                .and()
                .addFilterAfter(jwtTokenFilter, UsernamePasswordAuthenticationFilter.class)
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }

    @Autowired
    public void configure(AuthenticationManagerBuilder auth, BCryptPasswordEncoder bCryptPasswordEncoder) throws Exception {
        auth.authenticationProvider(authenticationProvider(bCryptPasswordEncoder));
    }

    @Bean
    public AuthenticationProvider authenticationProvider(BCryptPasswordEncoder bCryptPasswordEncoder) {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setUserDetailsService(customUserDetailsService);
        provider.setPasswordEncoder(bCryptPasswordEncoder);
        return provider;
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
