package pelog.pelogspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoController {

    @GetMapping("todo")
    @ResponseBody
    public Todo TodoApi() {
        Todo todo = new Todo();
        todo.setName("hi");
        return todo;
    }

    @PostMapping(value = "/list")
    public TodoValue TodoList(@RequestBody TodoValue tv) {
        return tv;
    }

    static class Todo {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class TodoValue {
        private Integer id;
        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
    }
}
