package in.ineuron.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.ineuron.dto.Student;
import in.ineuron.util.JdbcUtil;

public class StudentDAOImpl implements IStudentDAO {
	
	Connection connection=null;
	

	@Override
	public String save(Student student) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt=null;
		String  sqlInsertQuery= "insert into student(SNAME,SAGE,SADDRESS)values(?,?,?)";
		try {
			connection=JdbcUtil.getJdbcConnection();
			pstmt=connection.prepareStatement(sqlInsertQuery);
			
			if(pstmt!=null) {
				pstmt.setString(1, student.getName());
				pstmt.setInt(2,  student.getAge());
				pstmt.setString(3,  student.getSaddress());
				
				int rowAffected =pstmt.executeUpdate();
				if(rowAffected==1)
				   return "success";
				else
					return "Failure";
					
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Student findById(Integer sid) {
		// TODO Auto-generated method stub
		
		PreparedStatement pstmt=null;
		String sName = null,sAge=null,sAddress=null,studentid=null;
		Student student = new Student();
		String  sqlSelectQuery= "Select SNAME,SAGE,SADDRESS,SID from student where sid =?";
		try {
			connection=JdbcUtil.getJdbcConnection();
			pstmt=connection.prepareStatement(sqlSelectQuery);
			
			if(pstmt!=null) {
				pstmt.setInt(1, sid);
				
				
				ResultSet rs =pstmt.executeQuery();
				while(rs.next()) {
					sName=rs.getString(1);
					sAge=rs.getString(2);
					sAddress=rs.getString(3);
					studentid=rs.getString(4);
				}
			    student.setSid(Integer.parseInt(studentid));
				student.setName(sName);
				student.setAge(Integer.parseInt(sAge));
				student.setSaddress(sAddress);
				
				if(student!=null)
					return student;
				
				   		
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String updateById(Student student) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt=null;
		String  sqlUpdateQuery= "update student set SNAME =?,SAGE=?,SADDRESS=? where sid =?";
		try {
			connection=JdbcUtil.getJdbcConnection();
			pstmt=connection.prepareStatement(sqlUpdateQuery);
			
			if(pstmt!=null) {
				pstmt.setString(1, student.getName());
				pstmt.setInt(2, student.getAge());
				pstmt.setString(3,  student.getSaddress());
				pstmt.setInt(4, student.getSid());
				
				int rowAffected =pstmt.executeUpdate();
				if(rowAffected==1)
				   return "success";
				else
					return "Failure";
					
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String deleteById(Integer sid) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt=null;
		String status =null;
		String  sqlDeleteQuery= "Delete from student where sid =?";
		try {
			connection=JdbcUtil.getJdbcConnection();
			pstmt=connection.prepareStatement(sqlDeleteQuery);
			
			if(pstmt!=null) {
				pstmt.setInt(1, sid);

				int rowAffected =pstmt.executeUpdate();
				if(rowAffected==1) {
					status ="success";
				   return status;
				}
				else {
					status ="Not Found";
					return status;
				}
					
			}
			
		} catch (SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			status ="failure";
		} 
		return status;
	}

}
