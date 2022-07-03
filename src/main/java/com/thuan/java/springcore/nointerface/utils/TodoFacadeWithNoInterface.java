package com.thuan.java.springcore.nointerface.utils;

import java.util.List;

import org.springframework.stereotype.Component;

import com.thuan.java.springcore.model.Todo;
import com.thuan.java.springcore.nointerface.service.TodoServiceWithNoInterface;

@Component
public class TodoFacadeWithNoInterface {

	private TodoServiceWithNoInterface todoServiceWithNoInterface;

	public TodoFacadeWithNoInterface(TodoServiceWithNoInterface todoServiceWithNoInterface) {
		this.todoServiceWithNoInterface = todoServiceWithNoInterface;
	}

	public List<Todo> getTodoList() {
		return todoServiceWithNoInterface.findAllTodos();
	}

}
