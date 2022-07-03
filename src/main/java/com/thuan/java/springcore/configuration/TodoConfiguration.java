package com.thuan.java.springcore.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.thuan.java.springcore.withinterface.service.InMemoryTodoServiceImpl;
import com.thuan.java.springcore.withinterface.service.TodoService;
import com.thuan.java.springcore.withinterface.utils.TodoFacadeWithInterface;

@Configuration
public class TodoConfiguration {
	@Bean
	public TodoFacadeWithInterface todoFacadeWithInterface2(@Qualifier("databaseTodoServiceImpl") TodoService service) {
		return new TodoFacadeWithInterface(service);
	}

	@Bean
	public TodoFacadeWithInterface todoFacadeWithInterface(InMemoryTodoServiceImpl service) {
		return new TodoFacadeWithInterface(service);
	}
}
