package com.mockitojunit.todoserviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.mockitojunit.todoservice.TodoService;

public class TodoServiceImpl {

    private TodoService todoService;

    public TodoServiceImpl(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<String> retrieveTododRelatedToSpring(String user){
        List<String> filteredTodos = new ArrayList<String>();
        List<String> todos = todoService.retriveTodos(user);

        for (String todo : todos) {
            if (todo.contains("Spring")) {
                filteredTodos.add(todo);
            }
        }

        return filteredTodos;
    }

    
    
}
