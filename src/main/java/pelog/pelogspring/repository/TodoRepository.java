package pelog.pelogspring.repository;

import pelog.pelogspring.domain.Todo;

import java.util.List;

public interface TodoRepository {
    Todo save(Todo todo);
    List<Todo> findAll();
}
