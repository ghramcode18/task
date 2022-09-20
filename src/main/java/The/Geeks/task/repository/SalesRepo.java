package The.Geeks.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import The.Geeks.task.entities.Sales;
@Repository
public interface SalesRepo extends JpaRepository<Sales,Long>{
    
}
