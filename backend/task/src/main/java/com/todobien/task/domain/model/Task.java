package com.todobien.task.domain.model;

import lombok.Data;

@Data
public class Task {
    String id;
    String title;
    String description;
    String priority;
    String status;
    String startTime;
    String endTime;
}
