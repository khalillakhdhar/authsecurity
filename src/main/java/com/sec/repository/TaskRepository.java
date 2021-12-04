package com.sec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sec.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
