package pl.opole.uni.springWebApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.opole.uni.springWebApp.models.Supplier;

public interface ISupplierRepository extends JpaRepository<Supplier, Long> {
}
