package pl.kossowski.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kossowski.project.model.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {


}
