package pelog.pelogspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pelog.pelogspring.repository.MemoryTodoRepository;
import pelog.pelogspring.repository.TodoRepository;
import pelog.pelogspring.service.TodoService;

@Configuration
public class SpringConfig {

    @Bean
    public TodoService todoService() {
        return new TodoService(todoRepository());
    }

    @Bean
    public TodoRepository todoRepository() {
        return new MemoryTodoRepository();
    }
}
