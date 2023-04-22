package group_8.climatechangebackend.repositories;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;

import io.jsonwebtoken.Claims;

public interface JwtUtilService {
    String generateToken(UserDetails userDetails);
    String getUsernameFromToken(String token);
    <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver);
    boolean isTokenExpired(String token);
    boolean validateToken(String token, UserDetails userDetails);
}