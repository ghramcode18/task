package The.Geeks.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import The.Geeks.task.entities.Product;

public interface productRepo extends JpaRepository<Product,Long> {
    
}
