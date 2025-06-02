package in.ineuron.factory;

import in.ineuron.DAO.IStudentDAO;
import in.ineuron.DAO.StudentDAOImpl;

public class StudentDaoFactory {
	
	private static IStudentDAO studentDAO =null;
	
	private StudentDaoFactory() {
		
	}
	
	public static IStudentDAO getStudentDAO() {
		
		if(studentDAO==null)
			 studentDAO=new StudentDAOImpl();
		
		return studentDAO;
		
	}

}
