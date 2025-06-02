package in.ineuron.services;

import in.ineuron.dto.Student;

public interface IStudentService {
	
	String save(Student student); //Creating a record
	
	Student findById(Integer sid);// For Read Operation of Database
	
	String updateById(Student student);// update a record
	
	String deleteById(Integer sid);//Delete a record
	
}
