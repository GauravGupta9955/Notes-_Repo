package com.spring.orm.SpringORm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.SpringORm.dao.StudentDao;
import com.spring.orm.SpringORm.entities.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean go =true;
        Integer sid=null;
        Student stuValue=null;
        String uName=null;
        String uCity=null;
     
		while (go) {
			System.out.println("Press 1 for add new Student");
			System.out.println("Press 2 for diplay all Student");
			System.out.println("Press 3 for get details of single student");
			System.out.println("Press 4 for delete Students");
			System.out.println("Press 5 for update Students");
			System.out.println("Press 6 for exit");

			try {
				int input = Integer.parseInt(br.readLine());

				switch (input) {
				case 1:
					  //add new Student
					System.out.println("enter the user Id");
					sid=Integer.parseInt(br.readLine());
					
					System.out.println("enter the User name");
					uName=br.readLine();
					
					System.out.println("enter the city");
					uCity=br.readLine();
					
					Student student = new Student(sid,uName,uCity);
					studentDao.insert(student);
					break;

				case 2:
					//display all Student
					List<Student> studnetList =studentDao.getAllStudents();
					for(Student a:studnetList) {
						System.out.println("Student id :"+a.getStudentId());
						System.out.println("Student name :"+a.getStudentName());
						System.out.println("Student city :"+a.getStudentCity());	
					}
					break;

				case 3:
					//get single Student data
					System.out.println("Enter the Student id which you want");
					sid =Integer.parseInt(br.readLine());
				    stuValue=studentDao.getStudent(sid);
					System.out.println("Student id :"+stuValue.getStudentId());
					System.out.println("Student name :"+stuValue.getStudentName());
					System.out.println("Student city :"+stuValue.getStudentCity());	
					break;

				case 4:
                    //delete Students
					System.out.println("Enter the Student id which you want");
					sid =Integer.parseInt(br.readLine());
				    studentDao.deleteStudent(sid);
					break;

				case 5:
                    //Update Students
					System.out.println("enter the user Id");
					sid=Integer.parseInt(br.readLine());
					stuValue=studentDao.getStudent(sid);
					sid=stuValue.getStudentId();
					uName=stuValue.getStudentName();
					uCity=stuValue.getStudentCity();
					
					System.out.println("enter the name which needs to be updated");
					String stuName=(br.readLine()!=null)?br.readLine():uName;
					System.out.println("enter the city which needs to be updated");
					String stucity=(br.readLine()!=null)?br.readLine():uCity;
					
					stuValue.setStudentId(sid);
					stuValue.setStudentCity(stucity);
					stuValue.setStudentName(stuName);
					
					break;

				case 6:
                    go=false;
					break;

				default:
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid Input try with another one!!");
			}
		}
		
		System.out.println("Thank you for using my application");
		System.out.println("see you soon");


	}
}