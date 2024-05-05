package com.example.todolist.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TodolistResponseDTO {
    private int id;
    private String description;
    private boolean isCompleted;
    private String createdDate;
}
