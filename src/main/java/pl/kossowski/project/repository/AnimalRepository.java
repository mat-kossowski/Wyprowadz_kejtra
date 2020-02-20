package pl.kossowski.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kossowski.project.model.Animal;

public interface AnimalRepository extends JpaRepository<Animal, String> {
}
