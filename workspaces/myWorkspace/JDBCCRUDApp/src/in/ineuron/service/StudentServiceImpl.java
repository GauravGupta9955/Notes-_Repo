package in.ineuron.service;

import in.ineuron.DAO.IStudentDAO;
import in.ineuron.dto.Student;
import in.ineuron.factory.StudentDaoFactory;
import in.ineuron.factory.StudentServiceFactory;

public class StudentServiceImpl implements IStudentService {

	IStudentDAO studentDAO;
	@Override
	public String save(Student student) {
		// TODO Auto-generated method stub
		studentDAO=StudentDaoFactory.getStudentDAO();
		return studentDAO.save(student);
		
	}

	@Override
	public Student findById(Integer sid) {
		// TODO Auto-generated method stub
		studentDAO=StudentDaoFactory.getStudentDAO();
		return studentDAO.findById(sid);
	}

	@Override
	public String updateById(Student student) {
		// TODO Auto-generated method stub
		studentDAO=StudentDaoFactory.getStudentDAO();
		return studentDAO.updateById(student);
	}

	@Override
	public String deleteById(Integer sid) {
		// TODO Auto-generated method stub
		studentDAO=StudentDaoFactory.getStudentDAO();
		return studentDAO.deleteById(sid);
	}

}
