package in.ineuron.controller;


import in.ineuron.dto.Student;
import in.ineuron.factory.StudentServiceFactory;
import in.ineuron.service.IStudentService;

public class StudentControllerImpl implements IStudentController {
	
	IStudentService studentService;

	@Override
	public String save(Student student) {
		// TODO Auto-generated method stub
		studentService=StudentServiceFactory.getStudentService();
		return studentService.save(student);
		
	}

	@Override
	public Student findById(Integer sid) {
		// TODO Auto-generated method stub
		studentService=StudentServiceFactory.getStudentService();
		return studentService.findById(sid);
	}

	@Override
	public String updateById(Student student) {
		// TODO Auto-generated method stub
		studentService=StudentServiceFactory.getStudentService();
		return studentService.updateById(student);
	}

	@Override
	public String deleteById(Integer sid) {
		// TODO Auto-generated method stub
		studentService=StudentServiceFactory.getStudentService();
		return studentService.deleteById(sid);
	}

}
