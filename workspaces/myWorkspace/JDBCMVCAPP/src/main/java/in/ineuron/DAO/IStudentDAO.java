package in.ineuron.DAO;

import in.ineuron.dto.Student;

public interface IStudentDAO {

	String save(Student student); //Creating a record
	
	Student findById(Integer sid);// For Read Operation of Database
	
	String updateById(Student student);// update a record
	
	String deleteById(Integer sid);//Delete a record
	

}
