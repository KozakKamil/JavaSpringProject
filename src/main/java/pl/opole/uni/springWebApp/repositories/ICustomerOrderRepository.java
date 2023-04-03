package pl.opole.uni.springWebApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.opole.uni.springWebApp.models.CustomerOrder;

public interface ICustomerOrderRepository extends JpaRepository<CustomerOrder, Long> {
}
