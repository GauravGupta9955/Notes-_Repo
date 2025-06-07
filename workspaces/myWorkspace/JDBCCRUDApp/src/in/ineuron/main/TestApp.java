package in.ineuron.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import in.ineuron.controller.IStudentController;
import in.ineuron.dto.Student;
import in.ineuron.factory.StudentControllerFactory;

public class TestApp {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while (true) {
				System.out.println("1. CREATE");
				System.out.println("2. READ");
				System.out.println("3. UPDATE");
				System.out.println("4. DELETE");
				System.out.println("5. EXIT");
				System.out.println("Your Option :: [1,2,3,4,5]");

				Integer option = Integer.parseInt(br.readLine());
				IStudentController studentController = StudentControllerFactory.getStudentController();
				Student student = new Student();
				Integer sid=null;
				Student studentRecord =null;
				String status=null;
				String name =null;
				String city=null;
				String email=null;
				String country =null;
				switch (option) {
				case 1:
					System.out.println("Enter the name");
					name = br.readLine();
					System.out.println("Enter the city");
					city = br.readLine();
					System.out.println("Enter the email");
					email = br.readLine();
					System.out.println("Enter the country");
					country = br.readLine();
					
					student.setCity(city);
					student.setCountry(country);
					student.setEmail(email);
					student.setName(name);
					status=studentController.save(student);
					
					if(status.equalsIgnoreCase("success"))
						System.out.println("Record Inserted Successfully.....");
					else if(status.equalsIgnoreCase("Failure"))
						System.out.println("Some problem occured");
					break;
					
				case 2:
					
					System.out.println("Enter the Student id");
					sid =Integer.parseInt(br.readLine());
                    student.setSid(sid);
                    studentRecord= studentController.findById(sid);
                    if(studentRecord!=null)
                    	System.out.println(studentRecord);
                    else
                    	System.out.println("Record not available for the given id ::"+sid);
					
					break;
					
				case 3:
					
					System.out.println("Enter the id of the record to be updated");
					sid =Integer.parseInt(br.readLine());
                    student.setSid(sid);
                    studentRecord= studentController.findById(sid);
                    if(studentRecord!=null) {
                    	Student newStudent = new Student();
                    	newStudent.setSid(sid);
                    	System.out.println("Student Name::[Old name is::" +studentRecord.getName());
                    	String newName= br.readLine();
                    	
                    	if(newName==null || newName.equals("")) {
                    		newStudent.setName(studentRecord.getName());
                    	}
                    	else {
                    		newStudent.setName(newName);
                    	}
                    	
                    	System.out.println("Student Email::[Old email is::" +studentRecord.getEmail());
                    	String newEmail= br.readLine();
                    	
                    	if(newEmail==null || newEmail.equals("")) {
                    		newStudent.setEmail(studentRecord.getEmail());
                    	}
                    	else {
                    		newStudent.setEmail(newEmail);
                    	}
                    	
                    	System.out.println("Student city::[Old City is::" +studentRecord.getCity());
                    	String newCity= br.readLine();
                    	
                    	if(newCity==null || newCity.equals("")) {
                    		newStudent.setCity(studentRecord.getCity());
                    	}
                    	else {
                    		newStudent.setCity(newCity);
                    	}
                    	
                    	System.out.println("Student Country::[Old email is::" +studentRecord.getCountry());
                    	String newCountry= br.readLine();
                    	
                    	if(newCountry==null || newCountry.equals("")) {
                    		newStudent.setCountry(studentRecord.getCountry());
                    	}
                    	else {
                    		newStudent.setCountry(newCountry);
                    	}
                    	
                    	status=studentController.updateById(newStudent);
                    	
                    	if(status.equalsIgnoreCase("success"))
    						System.out.println("Record updated Successfully.....");
    					else if(status.equalsIgnoreCase("Failure"))
    						System.out.println("Record Updation Failed");
    					else {
    						System.out.println("Some Problem occured");
    					}
                    	
                    	
                    }
                    else
                    	System.out.println("Record not available for the given id ::"+sid);
					break;
					
				case 4:
					System.out.println("Enter the Student id");
					sid =Integer.parseInt(br.readLine());
                    student.setSid(sid);
                    status= studentController.deleteById(sid);
                    if(status.equalsIgnoreCase("success"))
						System.out.println("Record deleted Successfully.....");
					else if(status.equalsIgnoreCase("Failure"))
						System.out.println("Some problem occured");
					else 
						System.out.println("Record not available for the gived id to deleted");
					break;
					
				case 5:
					System.out.println("Thanks for using the application");
					System.exit(0);
					break;
				default:
					System.out.println("Please enter the option like 1,2,3,4,5 for operation");
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
