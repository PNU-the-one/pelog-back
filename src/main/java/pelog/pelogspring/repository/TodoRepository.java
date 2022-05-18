package pelog.pelogspring.repository;

import pelog.pelogspring.domain.Todo;

public interface TodoRepository {
    Todo save(Todo todo);
}
