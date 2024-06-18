package com.attendencefacultymanage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.attendencefacultymanage.dao.AttendenceDao;
import com.attendencefacultymanage.entity.ClassRoom;
import com.attendencefacultymanage.entity.ClassSchedule;
import com.attendencefacultymanage.entity.Course;
import com.attendencefacultymanage.entity.Department;
import com.attendencefacultymanage.entity.Faculty;
import com.attendencefacultymanage.entity.Subject;

@Service
public class AttendenceService {
	@Autowired
	AttendenceDao dao;

	public ClassRoom addclassroom(@RequestBody ClassRoom room) {
		return dao.addClassRoom(room);

	}

	public List<ClassRoom> getAllclassRoom() {

		return dao.getAllclassRoom();
	}

	public ClassRoom getClassRoomById(int id) {
		return dao.getClassRoomById(id);
	}

	public ClassRoom deleteClassRoomById(int id) {
		return dao.deleteClassRoomById(id);
	}

	public ClassRoom updateClassRoom(ClassRoom room) {
		return dao.updateClassRoom(room);

	}

	public ClassSchedule addClassSchedule(ClassSchedule schedule) {
		return dao.addClassSchedule(schedule);
	}

	public ClassSchedule getClassScheduleById(int id) {
		return dao.getClassScheduleById(id);
	}

	public List<ClassSchedule> getAllclassSchedule() {

		return dao.getAllclassSchedule();
	}

	public ClassSchedule updateClassSchedule(ClassSchedule schedule) {
		return dao.updateClassSchedule(schedule);
	}

	public ClassSchedule deleteClassScedulesById(@PathVariable int id) {
		return dao.deleteClassSchedulesById(id);
	}

	public Course addCourse(Course course) {
		return dao.addCourse(course);
	}

	public List<Course> getAllCourse() {
		return dao.getAllCourse();
	}

	public Course getCoursesById(int id) {
		return dao.getCoursesById(id);

	}

	public Course updateCourse(Course course) {
		return dao.updateCourse(course);

	}

	public Course deleteCourseById( int id) {
		return dao.deleteCourseById(id);
	}
	public Department addDepartment( Department department) {
		return dao.addDepartment(department);
	}
	public List<Department> getAllDepartments(){
		return dao.getAllDepartments();
	}
	public Department getDepartmentById(int id) {
		return dao.getDepartmentById(id);
}
	public Department updateDepartment( Department department) {
		return dao.updateDepartment(department);

}
	public Department deleteDepartmentById( int id) {
		return dao.deleteDepartmentById(id);
	}
	public Faculty addFaculty( Faculty faculty) {
		return dao.addFaculty(faculty);
	}
	public List<Faculty> getAllFaculties(){
		return dao.getAllFaculties();
	}
	public Faculty getFacultyById( int id) {
		return dao.getFacultyById(id);
	}
	public Faculty  updateFaculty( Faculty faculty) {
		return dao.updateFaculty(faculty);

}
	public Faculty deleteFacultyById(int id) {
		return dao.deleteFacultyById(id);

	}
	public Subject addSubject(Subject subject ) {
		return dao.addSubject(subject);
	}
	public List<Subject> getAllSubjects(){
		return dao.getAllSubjects();
	}
	public Subject updateSubject(Subject subject) {
		return dao.updateSubject(subject);

	}
	
	public Subject deleteSubjectById( int id) {
		return dao.deleteSubjectById(id);

	}
	
}