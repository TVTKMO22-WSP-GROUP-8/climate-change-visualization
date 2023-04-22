package group_8.climatechangebackend.repositories;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import group_8.climatechangebackend.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}