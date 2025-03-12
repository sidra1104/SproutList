package com.SproutList.SproutList.repository;

import com.SproutList.SproutList.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
