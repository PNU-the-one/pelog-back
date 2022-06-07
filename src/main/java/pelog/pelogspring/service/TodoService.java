package pelog.pelogspring.service;

import pelog.pelogspring.domain.Todo;
import pelog.pelogspring.repository.TodoRepository;

import java.util.List;

public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Integer join(Todo todo){
        todoRepository.save(todo);
        return todo.getId();
    }

    public List<Todo> findTodo() {
        return todoRepository.findAll();
    }
}
