package com.thuan.java.springcore.nointerface.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.thuan.java.springcore.model.Todo;

@Service
public class TodoServiceWithNoInterface {
	public List<Todo> findAllTodos() {
		System.out.println("TodoServiceWithNoInterface");
		List<Todo> list = new ArrayList<Todo>();
		Todo todo = new Todo(1, "TodoServiceWithNoInterface");
		list.add(todo);
		return list;
	}
}
