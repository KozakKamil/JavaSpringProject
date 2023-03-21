package pl.opole.uni.springWebApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.opole.uni.springWebApp.models.Worker;

public interface IWorkerRepository extends JpaRepository<Worker, Long> {
}
