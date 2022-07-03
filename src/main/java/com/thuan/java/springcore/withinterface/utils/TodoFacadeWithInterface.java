package com.thuan.java.springcore.withinterface.utils;

import java.util.List;

import org.springframework.stereotype.Component;

import com.thuan.java.springcore.model.Todo;
import com.thuan.java.springcore.withinterface.service.TodoService;

//@Component
//bean sẽ được khởi tạo thông qua class TodoConfiguration
public class TodoFacadeWithInterface {

	private TodoService todoService;

	public TodoFacadeWithInterface(TodoService todoService) {
		this.todoService = todoService;
	}

	public List<Todo> getTodoList() {
		return todoService.findAllTodos();
	}

}
