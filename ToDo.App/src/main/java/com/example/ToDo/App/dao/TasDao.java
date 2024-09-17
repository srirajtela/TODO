package com.example.ToDo.App.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ToDo.App.model.Task;
import com.example.ToDo.App.repository.TaskRepository;

@Service
public class TasDao {
	@Autowired
	private TaskRepository taskRepository;

	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}

	public Task addTask(Task task) {
		return taskRepository.save(task);
	}

	public Task updateTask(int id, Task updatedTask) {
		Optional<Task> existingTask = taskRepository.findById(id);
		if (existingTask.isPresent()) {
			Task task = existingTask.get();
			task.setTitle(updatedTask.getTitle());
			task.setDescription(updatedTask.getDescription());
			task.setCompleted(updatedTask.isCompleted());
			return taskRepository.save(task);
		}
		return null;
	}

	public void deleteTask(int id) {
		taskRepository.deleteById(id);
	}

	public Optional<Task> getTaskById(int id) {
		return taskRepository.findById(id);
	}
}
