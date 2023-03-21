package pl.opole.uni.springWebApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.opole.uni.springWebApp.models.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
