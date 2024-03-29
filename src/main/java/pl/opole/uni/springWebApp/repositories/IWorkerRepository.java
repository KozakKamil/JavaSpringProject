package pl.opole.uni.springWebApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.opole.uni.springWebApp.models.Worker;
@Repository
public interface IWorkerRepository extends JpaRepository<Worker, Long> {
}
