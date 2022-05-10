package pelog.pelogspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

    @GetMapping("todo")
    @ResponseBody
    public Todo TodoApi() {
        Todo todo = new Todo();
        todo.setName("hi");
        return todo;
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
}
