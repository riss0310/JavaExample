package Admin;

import java.util.ArrayList;
import java.util.List;

import Student.Student;
import Student.StudentService;
import common.DAO;

public class AdminDAO extends DAO{
	private static AdminDAO adminDao = null;
	
	private AdminDAO() {
		
	}
	
	public static AdminDAO getInstance() {
		if(adminDao == null) {
			adminDao = new AdminDAO();
		}
		return adminDao;
	}
	
	
	//관리자 등록
	public int registerAdmin() {
	int result = 0;
	Admin admin = new Admin();
	try {
	     conn();
	     String insertQuery = "insert into admin (admin_id, admin_pw) "
	            		+ "values (?, ?)";
	            
	     pstmt = conn.prepareStatement(insertQuery);
	     pstmt.setString(1, admin.getAdminId());
	     pstmt.setString(2, admin.getAdminpw());
	            
	     result = pstmt.executeUpdate();
	            
	    } catch (Exception e) {
	      e.printStackTrace();
	    } finally {
	      disconn();
	    }
	      return result;

	    }

	    //관리자 로그인    
	public Admin login(String id) {
		Admin admin = null;
		try {
			conn();
			String sql = "SELECT * FROM admin WHERE admin_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
	    if(rs.next()){
	    	admin=new Admin();
	 	   	admin.setAdminId(rs.getString("admin_id"));
	  	    admin.setAdminPw(rs.getString("admin_pw"));
	    }
	   }catch (Exception e) {
	     	  e.printStackTrace();
	       
	   } finally {
		   disconn();
	   }
	   return admin;
	}
	
	
	
	    //수강생 전체조회
	   public List<Student> getAllStudent() {
		   List<Student> students = new ArrayList<>();
	    	try {
	    		conn();
	    		String sql = "SELECT * FROM students";
	    		pstmt = conn.prepareStatement(sql);
	    		rs = pstmt.executeQuery();
	    			
	    	while (rs.next()) {
	    		Student student = new Student();
	    		student.setStudentId(rs.getString("student_id"));
	    		student.setStudentName(rs.getString("student_name"));
	    		student.setStudentTel(rs.getString("student_tel"));
	    		student.setStudentAddress(rs.getString("student_address"));
	    		students.add(student);
	    			}
	    		} catch (Exception e) {
	    			e.printStackTrace();
	    		} finally {
	    			disconn();
	    		}
	    		return students;
	    	}	        
	        
	    //수강생 개별조회
	   public Student getStudentById(String studentId) {
			Student student = null;
			try {
				conn();
				String sql = "SELECT * FROM student WHERE student_id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, studentId);
				rs = pstmt.executeQuery();
				
				if (rs.next()) {
					student = new Student();
					student.setStudentId(studentId);
					student.setStudentName(rs.getString("student_name"));
					student.setStudentTel(rs.getString("student_tel"));
					student.setStudentAddress(rs.getString("student_address"));
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				disconn();
			}
			return student;
		}

	   
	   
	   
	     //수강생 정보 전체 삭제
		public int deleteAllStudent(Student student) {
			int result = 0;
		    try {
		        conn();
		        String sql = "delete from student";
		        pstmt = conn.prepareStatement(sql);
		        pstmt.setString(1, student.getGetStudentId());
		            
		        result = pstmt.executeUpdate();
		            
		    } catch (Exception e) {
		        	
		     e.printStackTrace();
		     
		    }finally {
		    	disconn();
		    }
		    return result;
		    }

		public int registerAdmin(Admin admin) {
				return 0;
			}

		//수강생 정보 개별 삭제
		public int deleteStudentById(String studentId) {
		int result = 0;
		try {
		    conn();
		    String sql = "DELETE FROM student WHERE student_id = ?";
		    pstmt = conn.prepareStatement(sql);
		    pstmt.setString(1, studentId);
		    result = pstmt.executeUpdate();
		            
		    
		    } catch (Exception e) {
		    e.printStackTrace();
		    } finally {
		    disconn();
		    }
			return result;
		    }
		

		//수강신청 승인
		public int authLecture(String lectureName) {
			
			int result = 0;
			try {
				conn();
				String sql = "update lecture_permission set lecture_permission = 'Y' where student_id = ?";
						
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, StudentService.studentInfo.getStudentId());
				
				result = pstmt.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				disconn();
			}
			return result;
			
		}
		

}
	    