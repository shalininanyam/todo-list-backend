package com.todo.backend.repository;

import com.todo.backend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByCompleted(boolean completed);  // To find tasks by completion status
    List<Task> findByTitleContainingIgnoreCase(String title);  // For search functionality
}
