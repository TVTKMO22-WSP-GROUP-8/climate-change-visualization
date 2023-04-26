// File name: UsernameNotFoundException.java
package group_8.climatechangebackend.exception;

public class UsernameNotFoundException extends RuntimeException {
    public UsernameNotFoundException(String message) {
        super(message);
    }
}