package model.repository.impl;

import model.bean.Student;
import model.repository.StudentRepository;

import java.util.List;

public class StudentRespositoryImpl implements StudentRepository {


    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public boolean save(Student student) {
        return false;
    }
}
