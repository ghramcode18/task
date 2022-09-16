package The.Geeks.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import The.Geeks.task.entities.User;

@Repository

public interface UserRepo  extends JpaRepository<User, Long> {
    
}
