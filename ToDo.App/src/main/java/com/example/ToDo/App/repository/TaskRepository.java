package com.example.ToDo.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ToDo.App.model.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}

