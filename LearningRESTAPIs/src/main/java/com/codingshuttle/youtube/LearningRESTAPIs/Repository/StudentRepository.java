package com.codingshuttle.youtube.LearningRESTAPIs.Repository;

import com.codingshuttle.youtube.LearningRESTAPIs.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
