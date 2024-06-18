package com.attendencefacultymanage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.attendencefacultymanage.entity.ClassRoom;
import com.attendencefacultymanage.entity.ClassSchedule;
import com.attendencefacultymanage.entity.Course;
import com.attendencefacultymanage.entity.Department;
import com.attendencefacultymanage.entity.Faculty;
import com.attendencefacultymanage.entity.Subject;
import com.attendencefacultymanage.service.AttendenceService;

@RestController
public class AttendanceController {
	@Autowired
	AttendenceService service;

	@PostMapping("/addclassroom")
	public ClassRoom addclassroom(@RequestBody ClassRoom room) {
		return service.addclassroom(room);

	}

	@GetMapping("/getallclassroom")
	public List<ClassRoom> getAllclassRoom() {

		return service.getAllclassRoom();

	}

	@GetMapping("/getclassroombyid/{id}")
	public ClassRoom getClassRoomById(@PathVariable int id) {
		return service.getClassRoomById(id);
	}

	@DeleteMapping("/deleteclassroom/{id}")
	public ClassRoom deleteClassRoomById(@PathVariable int id) {
		return service.deleteClassRoomById(id);

	}

	@PutMapping("/updateclassroom")
	public ClassRoom updateClassRoom(@RequestBody ClassRoom room) {
		return service.updateClassRoom(room);

	}

	@PostMapping("/addClassSchedule")
	public ClassSchedule addClassSchedule(@RequestBody ClassSchedule schedule) {
		return service.addClassSchedule(schedule);
	}
	@GetMapping("/getclassschedulebyid/{id}")
	public ClassSchedule getClassScheduleById(@PathVariable int id) {
		return service.getClassScheduleById(id);
		
	}
	@GetMapping("/getallclassschedules")
	public List<ClassSchedule> getAllclassSchedule() {

		return service.getAllclassSchedule();

	}
	@PutMapping("/updateclassschedule")
	public ClassSchedule updateClassSchedule(@RequestBody ClassSchedule  schedule) {
		return service.updateClassSchedule(schedule);

	}
	@DeleteMapping("/deleteclassshedulebyid/{id}")
	public ClassSchedule deleteClassScedulesById(@PathVariable int id) {
		return service.deleteClassScedulesById(id);
	}

	@PostMapping("/addcourse")
	public Course addCourse(@RequestBody Course course) {
		return service.addCourse(course);
	}
	@GetMapping("/getallcourses")
	public List<Course> getAllCourse(){
		return service.getAllCourse();
	}
	@GetMapping("/getcoursesbyid/{id}")
	public Course getCoursesById(@PathVariable int id) {
		return service.getCoursesById(id);
		
	}
	@PutMapping("/updatecourse")
	public Course updateCourse(@RequestBody Course  course) {
		return service.updateCourse(course);

	}
	@DeleteMapping("/deletecoursebyid/{id}")
	public Course deleteCourseById(@PathVariable int id) {
		return service.deleteCourseById(id);

	}
	@PostMapping("/adddepartment")
	public Department addDepartment(@RequestBody Department department) {
		return service.addDepartment(department);
	}
	@GetMapping("/getalldepartments")
	public List<Department> getAllDepartments(){
		return service.getAllDepartments();
	}
	@GetMapping("/getdepartmentsbyid/{id}")
	public Department getDepartmentById(@PathVariable int id) {
		return service.getDepartmentById(id);
	}
	@PutMapping("/updatedepartment")
	public Department updateDepartment(@RequestBody Department department) {
		return service.updateDepartment(department);

	}
	@DeleteMapping("/deletedepartmentbyid/{id}")
	public Department deleteDepartmentById(@PathVariable int id) {
		return service.deleteDepartmentById(id);

	}
	@PostMapping("/addfaculty")
	public Faculty addFaculty(@RequestBody Faculty faculty) {
		return service.addFaculty(faculty);
	}
	@GetMapping("/getallfaculties")
	public List<Faculty> getAllFaculties(){
		return service.getAllFaculties();
	}
	@GetMapping("/getfacultiesbyid/{id}")
	public Faculty getFacultyById(@PathVariable int id) {
		return service.getFacultyById(id);
	}
	@PutMapping("/updatefaculty")
	public Faculty  updateFaculty(@RequestBody Faculty faculty) {
		return service.updateFaculty(faculty);

	}
	@DeleteMapping("/deletefacultybyid/{id}")
	public Faculty deleteFacultyById(@PathVariable int id) {
		return service.deleteFacultyById(id);

	}
	@PostMapping("/addsubject")
	public Subject addSubject(@RequestBody Subject subject ) {
		return service.addSubject(subject);
	}
	@GetMapping("/getallsubjects")
	public List<Subject> getAllSubjects(){
		return service.getAllSubjects();
	}
	@PutMapping("/updatesubject")
	public Subject updateSubject(@RequestBody Subject subject) {
		return service.updateSubject(subject);

	}
	@DeleteMapping("/deletesubjectbyid/{id}")
	public Subject deleteSubjectById(@PathVariable int id) {
		return service.deleteSubjectById(id);

	}
	
	
}
