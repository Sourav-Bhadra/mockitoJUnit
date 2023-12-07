package com.mockitojunit.todoservice;

import java.util.List;

public interface TodoService {
    public List<String> retriveTodos(String user);
}
