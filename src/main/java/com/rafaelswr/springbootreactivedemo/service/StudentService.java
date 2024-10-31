package com.rafaelswr.springbootreactivedemo.service;

import com.rafaelswr.springbootreactivedemo.model.Student;
import com.rafaelswr.springbootreactivedemo.repository.StudentRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Flux<Student> findAll(){
        return studentRepository.findAll();
    }

    public Mono<Student> findByFirstName(s){
        return studentRepository.findAllById();
    }



}
