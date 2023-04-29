// File name: UserService.java
package group_8.climatechangebackend.services;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import group_8.climatechangebackend.models.User;
import group_8.climatechangebackend.repositories.UserRepository;

@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final AuthenticationManager authenticationManager;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, AuthenticationManager authenticationManager) {
        this.userRepository = userRepository;
        this.authenticationManager = authenticationManager;
        this.bCryptPasswordEncoder = new BCryptPasswordEncoder(); // Directly create a BCryptPasswordEncoder instance
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
        return org.springframework.security.core.userdetails.User.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .authorities("REQUIRED_PERMISSION") // Grant the required authority to users
                .build();
    }
    
    public User registerUser(String username, String password) {
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            throw new IllegalArgumentException("Username and password cannot be empty");
        }
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(bCryptPasswordEncoder.encode(password));
        return userRepository.save(newUser);
    }

    public void authenticate(String username, String password) {
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            throw new IllegalArgumentException("Username and password cannot be empty");
        }
        System.out.println("Authenticating user: " + username); // Add this line for debugging
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
        if (!bCryptPasswordEncoder.matches(password, user.getPassword())) {
            throw new BadCredentialsException("Incorrect password");
        }
    }
}
