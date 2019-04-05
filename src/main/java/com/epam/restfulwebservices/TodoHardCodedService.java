package com.epam.restfulwebservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TodoHardCodedService {

	private static List<Todo> todos = new ArrayList<>();
	private static long idCounter = 0;

	static {
		
		todos.add(new Todo(++idCounter, "mario", "Learn to Dance", new Date(), false));
		todos.add(new Todo(++idCounter, "mario", "Learn Microservices", new Date(), false));
		todos.add(new Todo(++idCounter, "mario", "Learn Angular", new Date(), false));
	}

	public List<Todo> getTodos() {
		return todos;
	}

	public Todo deleteById(long id) {
		Todo todo = findById(id);
		if (todo != null) {
			todos.remove(todo);
		}
		return todo;
	}

	public Todo findById(long id) {


		Todo returningTodo = null;

		for (Todo todo : todos) {
			if (todo.getId() == id) {
				returningTodo = todo;
			}
		}
		return returningTodo;
	}

	public Todo save(Todo todo) {
		if (todo.getId() == -1 || todo.getId() == 0) {
			todo.setId(++idCounter);
			todos.add(todo);
		} else {
			deleteById(todo.getId());
			todos.add(todo);
		}
		return todo;
	}

}
