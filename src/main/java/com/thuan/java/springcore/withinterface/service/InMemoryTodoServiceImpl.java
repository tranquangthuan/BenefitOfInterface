package com.thuan.java.springcore.withinterface.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.thuan.java.springcore.model.Todo;

@Service
public class InMemoryTodoServiceImpl implements TodoService {

	@Override
	public List<Todo> findAllTodos() {
		System.out.println("InMemoryTodoServiceImpl");
		List<Todo> list = new ArrayList<Todo>();
		Todo todo = new Todo(1, "InMemoryTodoServiceImpl");
		list.add(todo);
		return list;
	}

}
