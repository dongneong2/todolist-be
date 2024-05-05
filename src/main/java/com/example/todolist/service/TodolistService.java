package com.example.todolist.service;

import com.example.todolist.model.TodolistResponseDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodolistService {

    public List<TodolistResponseDTO> getTodolist();
    public int createTodoItem (String description);

    public int updateTodoItem (int id);

    public int deleteTodoItem(int id);
}
