package pelog.pelogspring.service;

import org.springframework.stereotype.Service;
import pelog.pelogspring.domain.Todo;
import pelog.pelogspring.repository.MemoryTodoRepository;
import pelog.pelogspring.repository.TodoRepository;

import java.util.List;

@Service
public class TodoService {
    private final TodoRepository todoRepository = new MemoryTodoRepository();

    public Integer join(Todo todo){
        todoRepository.save(todo);
        return todo.getId();
    }

    public List<Todo> findTodo() {
        return todoRepository.findAll();
    }
}
