package com.yash.projects.Spring.security.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    private int id;
    private int marks;
    private String name;

}
