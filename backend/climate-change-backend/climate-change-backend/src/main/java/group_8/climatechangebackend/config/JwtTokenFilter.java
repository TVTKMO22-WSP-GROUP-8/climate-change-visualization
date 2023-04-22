package group_8.climatechangebackend.config;

import org.springframework.beans.factory.annotation.Autowired;

import group_8.climatechangebackend.services.CustomUserDetailsService;
import group_8.climatechangebackend.services.JwtUtilService;

public class JwtTokenFilter {

    @Autowired
    public JwtTokenFilter(JwtUtil jwtUtil, CustomUserDetailsService customUserDetailsService) {
        this.jwtUtil = jwtUtil;
        this.customUserDetailsService = customUserDetailsService;
    }
