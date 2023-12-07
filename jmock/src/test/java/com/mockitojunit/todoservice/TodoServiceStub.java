package com.mockitojunit.todoservice;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{

    @Override
    public List<String> retriveTodos(String user) {
        return Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Code");
    }
    
}
