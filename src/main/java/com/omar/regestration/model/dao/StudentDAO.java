package com.omar.regestration.model.dao;

import com.omar.regestration.model.entity.Student;

public interface StudentDAO {
    Student findById();
    Student findEmail();

    void Save (Student student);
    void Update (Student student);
    void delete(Student student);
}

