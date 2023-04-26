// File name: UserController.java
package group_8.climatechangebackend.controllers;

import group_8.climatechangebackend.models.AuthenticationResponse;
import org.springframework.http.HttpHeaders;
import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import group_8.climatechangebackend.models.User;
import group_8.climatechangebackend.repositories.UserRepository;
import group_8.climatechangebackend.services.UserService;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;

    @Value("${my.token}")
    private String token;

    @Autowired
    public UserController(@Lazy UserRepository userRepository, @Lazy UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody User user) throws Exception {
        authenticate(user.getUsername(), user.getPassword());
        final UserDetails userDetails = userService.loadUserByUsername(user.getUsername());
        System.out.println("Generated token: "+ token); // line for debugging
        return ResponseEntity.ok()
             .header("Authorization", "Bearer " + token)
             .build();

    }
    
    private void authenticate(String username, String password) throws BadCredentialsException {
        System.out.println("Authenticating user: " + username); // line for debugging
        try {
            userService.authenticate(username, password);
        } catch (DisabledException e) {
            System.out.println("User is disabled: " + username); // line for debugging
            throw new BadCredentialsException("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            System.out.println("Invalid credentials for user: " + username); // line for debugging
            throw new BadCredentialsException("INVALID_CREDENTIALS", e);
        }
    }

    // Add methods for deleting users and their visualization views
    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteUser(Principal principal) {
        User user = userRepository.findByUsername(principal.getName())
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        userRepository.delete(user);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User registeredUser = userService.registerUser(user.getUsername(), user.getPassword());
        if (registeredUser != null) {
            return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
