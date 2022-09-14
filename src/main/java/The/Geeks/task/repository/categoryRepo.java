package The.Geeks.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import The.Geeks.task.entities.Category;

public interface categoryRepo extends JpaRepository<Category,Long> {
    
}
