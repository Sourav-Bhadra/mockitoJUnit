package com.mockitojunit;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.mockitojunit.todoservice.TodoService;
import com.mockitojunit.todoservice.TodoServiceStub;
import com.mockitojunit.todoserviceimpl.TodoServiceImpl;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test(){
        TodoService todoServiceStub = new TodoServiceStub();
        TodoServiceImpl todoServiceImpl = new TodoServiceImpl(todoServiceStub);

        List<String> filteredTodos=todoServiceImpl.retrieveTododRelatedToSpring("Dummy");

        assertEquals(2, filteredTodos.size());
    }
}
