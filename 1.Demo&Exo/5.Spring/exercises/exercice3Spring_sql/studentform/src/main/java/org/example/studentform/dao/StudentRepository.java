package org.example.studentform.dao;

import org.example.studentform.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    Student findStudentByFirstnameAndLastname(String firstname, String lastname);
}
