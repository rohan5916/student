package com.example.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student.entity.Register;

public interface RegisterRepository extends JpaRepository<Register, Long> {

	Register findByEmail(String emailId);

}
