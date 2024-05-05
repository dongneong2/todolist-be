package com.example.todolist.service.impl;

import com.example.todolist.model.TodolistResponseDTO;
import com.example.todolist.repository.TodolistMapper;
import com.example.todolist.service.TodolistService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class TodolistServiceImpl implements TodolistService {

    private final TodolistMapper todolistMapper;

    @Override
    public List<TodolistResponseDTO> getTodolist() {
        List<TodolistResponseDTO> response = todolistMapper.selectTodolist();
        return response;
    }

    @Override
    public int createTodoItem(String description) {
        return todolistMapper.createTodoItem(description);
    }

    @Override
    public int updateTodoItem(int id) {
        return todolistMapper.updateTodoItem(id);
    }

    @Override
    public int deleteTodoItem(int id) {
        return todolistMapper.deleteTodoItem(id);

    }
}
