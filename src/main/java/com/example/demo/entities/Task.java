package com.example.demo.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long task_id;

    @Column(nullable = false)
    private String task_name;

    @Column(nullable = false)
    private String task_description;

    @Column(nullable = false)
    private long task_priority;

    @Column(nullable = false)
    private String task_status;

    @Column(nullable = false)
    private LocalDateTime task_deadline;

    @Column(nullable = false)
    private LocalDateTime task_created_at;

    @Column(nullable = false)
    private LocalDateTime task_updated_at;
    
    @Column(nullable = false)
    private long reschedule_count;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Task(String name, String description, long priority , String status ,LocalDateTime task_updated_at) {
        this.task_name = name;
        this.task_description = description;
        this.task_priority = priority;
        this.task_status = status;
        this.task_updated_at = task_updated_at;
    }

}
