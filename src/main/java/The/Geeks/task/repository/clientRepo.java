package The.Geeks.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import The.Geeks.task.entities.Client;

@Repository

public interface clientRepo  extends JpaRepository<Client, Long> {
    
}
