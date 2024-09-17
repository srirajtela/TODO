package com.example.ToDo.App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.ToDo.App.dao.TasDao;
import com.example.ToDo.App.model.Task;

@Controller
public class ToDoController {

	@Autowired
	private TasDao dao;

	@GetMapping("/")
	public String viewHomePage(Model model) {
	    model.addAttribute("tasks", dao.getAllTasks());
	    return "index"; // Must match the file name 'index.html' inside the templates folder
	}


	@GetMapping("/add")
	public String showAddTaskForm(Model model) {
		Task task = new Task();
		model.addAttribute("task", task);   
		return "add_task";
	}

	@PostMapping("/save")
	public String saveTask(@ModelAttribute("task") Task task) {
		dao.addTask(task);
		return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public String showEditTaskForm(@PathVariable(value = "id") int id, Model model) {
		Task task = dao.getTaskById(id).orElseThrow(() -> new IllegalArgumentException("Invalid task Id:" + id));
		model.addAttribute("task", task);
		return "edit_task";
	}

	@PostMapping("/update/{id}")
	public String updateTask(@PathVariable(value = "id") int id, @ModelAttribute("task") Task task) {
		dao.updateTask(id, task);
		return "redirect:/";
	}

	@GetMapping("/delete/{id}")
	public String deleteTask(@PathVariable(value = "id") int id) {
		dao.deleteTask(id);
		return "redirect:/";
	}
}
