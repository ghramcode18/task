package The.Geeks.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import The.Geeks.task.entities.Product;

@Repository

public interface productRepo extends JpaRepository<Product,Long> {
    
}
