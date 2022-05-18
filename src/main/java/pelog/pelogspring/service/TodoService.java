package pelog.pelogspring.service;

import pelog.pelogspring.domain.Todo;
import pelog.pelogspring.repository.MemoryTodoRepository;
import pelog.pelogspring.repository.TodoRepository;

public class TodoService {
    private final TodoRepository todoRepository = new MemoryTodoRepository();

    public Integer join(Todo todo){
        todoRepository.save(todo);
        return todo.getId();
    }
}
