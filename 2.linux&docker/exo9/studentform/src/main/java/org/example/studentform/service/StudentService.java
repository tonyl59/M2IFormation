package org.example.studentform.service;

import org.example.studentform.dao.StudentRepository;
import org.example.studentform.entity.Student;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student save(Student student){
        return studentRepository.save(student);
    }

    public List<Student> search_names(String name){
        List<Student> results = new ArrayList<>();
        name = name.toLowerCase();
        List<Student> students = studentRepository.findAll();
        for(Student s : students) {
            if (s.getFirstname().toLowerCase().contains(name) || s.getLastname().toLowerCase().contains(name)) {
                results.add(s);
            }
        }
        return results;
    }

    public Student update(Student student){
        return studentRepository.save(student);
    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    public Student findById(int id){
        return studentRepository.findById(id).orElse(null);
    }

    public void delete(Student student){
        studentRepository.delete(student);
    }
}



