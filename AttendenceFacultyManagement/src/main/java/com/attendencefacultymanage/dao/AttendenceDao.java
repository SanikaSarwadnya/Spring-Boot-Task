package com.attendencefacultymanage.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.attendencefacultymanage.entity.ClassRoom;
import com.attendencefacultymanage.entity.ClassSchedule;
import com.attendencefacultymanage.entity.Course;
import com.attendencefacultymanage.entity.Department;
import com.attendencefacultymanage.entity.Faculty;
import com.attendencefacultymanage.entity.Subject;

@Repository
public class AttendenceDao {
	@Autowired
	SessionFactory sf;

	// ClassRoom room;
	public ClassRoom addClassRoom(ClassRoom room) {
		Session session = sf.openSession();
		session.get(ClassRoom.class, room.getId());
		session.save(room);
		session.beginTransaction().commit();
		return room;

	}

	public List<ClassRoom> getAllclassRoom() {
		Session session = sf.openSession();
		List<ClassRoom> room = session.createQuery("from ClassRoom", ClassRoom.class).list();
		return room;
	}

	public ClassRoom getClassRoomById(int id) {
		Session session = sf.openSession();
		ClassRoom room = session.get(ClassRoom.class, id);
		session.save(room);
		session.beginTransaction().commit();

		return room;
	}

	public ClassRoom deleteClassRoomById(int id) {
		Session session = sf.openSession();
		ClassRoom room = session.get(ClassRoom.class, id);
		session.delete(room);
		session.beginTransaction().commit();

		return room;
	}

	public ClassRoom updateClassRoom(ClassRoom room) {
		Session session = sf.openSession();
		session.update(room);
		session.beginTransaction().commit();

		return room;

	}

	public ClassSchedule addClassSchedule(ClassSchedule schedule) {
		Session session = sf.openSession();
		session.get(ClassSchedule.class, schedule.getId());
		session.save(schedule);
		session.beginTransaction().commit();

		return schedule;
	}

	public ClassSchedule getClassScheduleById(int id) {
		Session session = sf.openSession();
		ClassSchedule schedule = session.get(ClassSchedule.class, id);
		session.save(schedule);
		session.beginTransaction().commit();

		return schedule;

	}
	public List<ClassSchedule> getAllclassSchedule() {
		Session session = sf.openSession();
		List<ClassSchedule> schedule = session.createQuery("from ClassSchedule", ClassSchedule.class).list();
		return schedule;
	}
	public ClassSchedule updateClassSchedule( ClassSchedule  schedule) {
		Session session = sf.openSession();
		session.update(schedule);
		session.beginTransaction().commit();
 return schedule;
 
	}
	public ClassSchedule deleteClassSchedulesById( int id) {
		Session session = sf.openSession();
		ClassSchedule schedule= session.get(ClassSchedule.class, id);
		session.delete(schedule);
		session.beginTransaction().commit();

		return schedule;
	}
	
	public Course addCourse( Course course) {
		Session session = sf.openSession();
		session.get(Course.class, course.getId());
		session.save(course);
		session.beginTransaction().commit();
		return course;
	}
	public List<Course> getAllCourse(){
		Session session = sf.openSession();
		List<Course> course = session.createQuery("from Course", Course.class).list();
		return course;
		
	}
	public Course getCoursesById(@PathVariable int id) {
		Session session = sf.openSession();
		Course course = session.get(Course.class, id);
		session.save(course);
		session.beginTransaction().commit();

		return course;
	

}
	public Course updateCourse( Course  course) {
		Session session = sf.openSession();
		session.update(course);
		session.beginTransaction().commit();
 return course;
 
	}
	public Course deleteCourseById( int id) {
		Session session = sf.openSession();
		Course course = session.get(Course.class, id);
		session.delete(course);
		session.beginTransaction().commit();

		return course;
		
	}
	public Department addDepartment(Department department) {
		Session session = sf.openSession();
		session.get(Department.class, department.getId());
		session.save(department);
		session.beginTransaction().commit();
		return department;
	
	}
	public List<Department> getAllDepartments(){
		Session session = sf.openSession();
		List<Department> department = session.createQuery("from Department", Department.class).list();
		return department;
		
	}
	public Department getDepartmentById( int id) {
		Session session = sf.openSession();
		Department department= session.get(Department.class, id);
		session.save(department);
		session.beginTransaction().commit();

		return department;
	}
	public Department updateDepartment(Department department) {
		Session session = sf.openSession();
		session.update( department);
		session.beginTransaction().commit();
   return  department;

}
	public Department deleteDepartmentById(int id) {
		Session session = sf.openSession();
		Department  department = session.get(Department.class, id);
		session.delete(department);
		session.beginTransaction().commit();
		return department;
}
	public Faculty addFaculty(Faculty faculty) {
		Session session = sf.openSession();
		session.get(Faculty.class, faculty.getId());
		session.save(faculty);
		session.beginTransaction().commit();
		return faculty;
	}
	public List<Faculty> getAllFaculties(){
		Session session = sf.openSession();
		List<Faculty> faculty = session.createQuery("from Faculty", Faculty.class).list();
		return faculty;
	}
	public Faculty getFacultyById(@PathVariable int id) {
		Session session = sf.openSession();
		Faculty faculty = session.get(Faculty.class, id);
		session.delete(faculty);
		session.beginTransaction().commit();
		return faculty;
	}
	public Faculty  updateFaculty(Faculty faculty) {
		Session session = sf.openSession();
		session.update(faculty );
		session.beginTransaction().commit();
	
		return faculty;
	}
	public Faculty deleteFacultyById(int id) {
		Session session = sf.openSession();
		Faculty faculty = session.get(Faculty.class, id);
		session.delete(faculty);
		session.beginTransaction().commit();
		return faculty;

	}
	public Subject addSubject(Subject subject ) {
		Session session = sf.openSession();
		session.get(Subject.class, subject.getId());
		session.save(subject);
		session.beginTransaction().commit();
		return subject;
	}
	public List<Subject> getAllSubjects(){
		Session session = sf.openSession();
		List<Subject> subject = session.createQuery("from Subject", Subject.class).list();
		
		return subject ;
	}
	public Subject updateSubject(Subject subject) {
		Session session = sf.openSession();
		session.update(subject );
		session.beginTransaction().commit();
		return subject;

	}
	public Subject deleteSubjectById(@PathVariable int id) {
		Session session = sf.openSession();
		Subject subject= session.get(Subject.class, id);
		session.delete(subject);
		session.beginTransaction().commit();
		return subject;

	}
	

}
