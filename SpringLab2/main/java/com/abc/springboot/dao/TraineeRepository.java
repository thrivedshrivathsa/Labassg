package com.abc.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.springboot.entity.Trainee;

public interface TraineeRepository extends JpaRepository<Trainee,Integer> {

}