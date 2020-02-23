package pl.kossowski.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kossowski.project.model.User;

public interface UserRepository extends JpaRepository<User, String> {

}
