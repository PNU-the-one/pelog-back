package pelog.pelogspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pelog.pelogspring.domain.Todo;
import pelog.pelogspring.service.TodoService;

import java.util.List;

@RestController
public class TodoController {

    private final TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("todo")
    @ResponseBody
    public TodoJson TodoApi() {
        TodoJson todo = new TodoJson();
        todo.setName("hi");
        return todo;
    }

    @PostMapping("list")
    public Todo TodoList(@RequestBody Todo tv) {
        todoService.join(tv);
        return tv;
    }

    @GetMapping("todolist")
    public List<Todo> list(){
        return todoService.findTodo();
    }

    static class TodoJson {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
