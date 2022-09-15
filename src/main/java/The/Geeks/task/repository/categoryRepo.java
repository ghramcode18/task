package The.Geeks.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import The.Geeks.task.entities.Category;

@Repository
public interface categoryRepo extends JpaRepository<Category,Long> {
  Category  findByName(String category);}
