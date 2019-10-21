package edu.hubu.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import edu.hubu.learn.dao.StudentDao;
import edu.hubu.learn.entity.Student;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Student getStudent(Long id) {
        return studentDao.findById(id).get();
    }

	public List<Student> getStudents() {
		return studentDao.findAll(new Sort(Direction.DESC, "id"));
    }

    public List<Student> searchStudents(String keyword) {
        log.info(keyword);
        Student student = new Student();
        student.setName(keyword);
        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("name", match->match.contains());
        Example<Student> example = Example.of(student, matcher);
        Sort sort = new Sort(Direction.DESC, "id");
        return studentDao.findAll(example, sort);
	}

    
    public Student addStudent(Student student) {
        return studentDao.save(student);
    }

    public void deleteStudent(Long id) {
        studentDao.deleteById(id);
    }

    public void modifyStudent(Student student) {
       studentDao.save(student);
    }

	
}