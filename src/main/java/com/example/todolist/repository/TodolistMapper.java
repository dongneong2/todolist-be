package com.example.todolist.repository;

import com.example.todolist.model.TodolistResponseDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodolistMapper {
    public List<TodolistResponseDTO> selectTodolist();

    public int createTodoItem(String description);

    public int updateTodoItem(int id);

    public int deleteTodoItem(int id);
}
