package pelog.pelogspring.repository;

import pelog.pelogspring.domain.Todo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryTodoRepository implements TodoRepository{

    private static Map<Integer, Todo> store = new HashMap<>();


    @Override
    public Todo save(Todo todo) {
        store.put(todo.getId(), todo);
        return todo;
    }

    @Override
    public List<Todo> findAll() {
        return new ArrayList<>(store.values());
    }
}
