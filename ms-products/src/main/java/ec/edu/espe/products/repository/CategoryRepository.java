package ec.edu.espe.products.repository;

import ec.edu.espe.products.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
