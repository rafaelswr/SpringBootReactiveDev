package com.rafaelswr.springbootreactivedemo.Model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;
import java.time.Period;

@Data
@Slf4j
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students")
public class Student {

    @Id
    private Integer id;
    private String name;
    private String lastName;

    private LocalDate birth;

    @Transient
    private int age;
    public int getAge() {
        return Period.between(birth,LocalDate.now()).getYears();
    }

    public Student(String name, String lastName, LocalDate birth) {
        this.name = name;
        this.lastName = lastName;
        this.birth = birth;
        this.age = getAge();
    }
}
