package com.spring.orm.SpringORm.dao;



import org.hibernate.FlushMode;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.SpringORm.entities.Student;

import antlr.collections.List;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
    
    @Transactional(readOnly=false)
	public int insert(Student student) {
		Integer i=(Integer)this.hibernateTemplate.save(student);
		
		return i;
		
	}
	
	public Student getStudent(int studentId) {
		Student student=this.hibernateTemplate.load(Student.class, studentId);
		return student;
	}
	
	public java.util.List<Student> getAllStudents(){
		
		java.util.List<Student> students=this.hibernateTemplate.loadAll(Student.class);
		return students;
		
	}
	//delete the data
    @Transactional(readOnly=false)
	public void deleteStudent(int studentID) {
		Student student=this.hibernateTemplate.load(Student.class, studentID);
		this.hibernateTemplate.delete(student);
	}
	
	//update the data
    @Transactional(readOnly=false)
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}
}
