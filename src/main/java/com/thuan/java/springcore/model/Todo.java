package com.thuan.java.springcore.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Todo {
	private long id;
	private String name;
}
