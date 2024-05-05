package com.example.todolist.controller;

import com.example.todolist.model.TodolistResponseDTO;
import com.example.todolist.service.TodolistService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class TooListContorller {

    private final TodolistService todolistService;

    @GetMapping("/todolist")
    public List<TodolistResponseDTO> getTodoList() {
        return todolistService.getTodolist();
    }

    @PostMapping("/todolist")
    public int createTodoItem(@RequestParam(name="description") String description) {
        return todolistService.createTodoItem(description);
    }

    @PutMapping("/todolist")
    public int updateTodoItem(@RequestParam(name="id") Integer id) {
        return todolistService.updateTodoItem(id);
    }

    @DeleteMapping("/todolist")
    public int deleteTodoItem(@RequestParam(name="id") Integer id) {
        return todolistService.deleteTodoItem(id);
    }
}
