package com.thuan.java.springcore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thuan.java.springcore.model.Todo;
import com.thuan.java.springcore.nointerface.utils.TodoFacadeWithNoInterface;
import com.thuan.java.springcore.withinterface.utils.TodoFacadeWithInterface;

@RestController
@RequestMapping("todo")
public class TodoController {

	@Autowired
	private TodoFacadeWithNoInterface todoFacadeWithNoInterface;

	@Autowired
	private TodoFacadeWithInterface todoFacadeWithInterface;

	// using bean get from config by name method
	@Autowired
	private TodoFacadeWithInterface todoFacadeWithInterface2;

	@GetMapping("1")
	public List<Todo> method1() {
		return todoFacadeWithNoInterface.getTodoList();
	}

	@GetMapping("2")
	public List<Todo> method2() {
		return todoFacadeWithInterface.getTodoList();
	}

	@GetMapping("3")
	public List<Todo> method3() {
		return todoFacadeWithInterface2.getTodoList();
	}
}
