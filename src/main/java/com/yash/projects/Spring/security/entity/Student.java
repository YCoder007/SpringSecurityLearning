package com.yash.projects.Spring.security.entity;

import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private int marks;
    private String name;

}
