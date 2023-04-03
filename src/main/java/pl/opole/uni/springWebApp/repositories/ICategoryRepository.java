package pl.opole.uni.springWebApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.opole.uni.springWebApp.models.Category;
import pl.opole.uni.springWebApp.models.Product;

public interface ICategoryRepository  extends JpaRepository<Category, Long> {
}
