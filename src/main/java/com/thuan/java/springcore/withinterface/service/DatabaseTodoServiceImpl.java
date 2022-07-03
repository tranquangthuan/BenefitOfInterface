package com.thuan.java.springcore.withinterface.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.thuan.java.springcore.model.Todo;


//@Primary
@Service
public class DatabaseTodoServiceImpl implements TodoService {

	@Override
	public List<Todo> findAllTodos() {
		System.out.println("DatabaseTodoServiceImpl");
		List<Todo> list = new ArrayList<Todo>();
		Todo todo = new Todo(1, "DatabaseTodoServiceImpl");
		list.add(todo);
		return list;
	}

}
