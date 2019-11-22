package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.bean.School;

public interface SchoolRepo extends JpaRepository<School, Integer>{

}
