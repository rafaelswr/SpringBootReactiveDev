package com.rafaelswr.springbootreactivedemo.repository;

import com.rafaelswr.springbootreactivedemo.model.Student;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StudentRepository extends ReactiveCrudRepository<Student, Integer> {

    Flux<Student> findAllByFirstName(String firstName);


    Mono<Student> findAllById();
}
