package edu.hubu.learn.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



import edu.hubu.learn.entity.Student;
import edu.hubu.learn.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

  
    @Autowired
    private StudentService studentService;

   
    @RequestMapping("/{id}")
    public ModelAndView student(@PathVariable Long id) {
        ModelAndView mav = new ModelAndView();
        Student student = studentService.getStudent(id);
        mav.addObject("student", student);
        mav.setViewName("student");
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable Long id) {
        studentService.deleteStudent(id);
        ModelAndView mav = new ModelAndView("redirect:/student/list");
        return mav;
    }

    @RequestMapping("/list")
    public ModelAndView students() {
        ModelAndView mav = new ModelAndView();
        List<Student> students=studentService.getStudents();
        mav.addObject("students", students);
        mav.setViewName("students");
        return mav;
    }

    @RequestMapping("/add")
    public ModelAndView addStudent() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("student_add");
        return mav;
    }

    @RequestMapping("/do_add")
    public ModelAndView doAddStudent(Student student) {
        studentService.addStudent(student);
        ModelAndView mav = new ModelAndView("redirect:/student/list");
        return mav;
    }

    @RequestMapping("/modify/{id}")
    public ModelAndView modifyStudent(@PathVariable Long id) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("student", studentService.getStudent(id));
        mav.setViewName("student_modify");
        return mav;
    }

    @RequestMapping("/do_modify")
    public ModelAndView doModifyStudent(Student student) {
       studentService.modifyStudent(student);
        ModelAndView mav = new ModelAndView("redirect:/student/list");
        return mav;
    }

    @RequestMapping("/search")
    public ModelAndView searchStudent() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("student_search");
        return mav;
    }

    @RequestMapping("/do_search")
    public ModelAndView doSearchStudent(HttpServletRequest httpRequest) {
        ModelAndView mav = new ModelAndView();
        String keyword = httpRequest.getParameter("keyword");
        List<Student> students = studentService.searchStudents(keyword);
        mav.addObject("students", students);
        mav.setViewName("students");
        return mav;
    }

    
}