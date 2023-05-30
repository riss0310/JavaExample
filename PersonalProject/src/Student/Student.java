package Student;




public class Student {
	private String studentId;
	private String studentPw;
	private String studentName;
	private String studentTel;
	private String studentAddress;
	private static String currentLecture;
	
	

	public String getStudentPw() {
		return studentPw;
	}

	public void setStudentPw(String studentPw) {
		this.studentPw = studentPw;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentTel() {
		return studentTel;
	}

	public void setStudentTel(String studentTel) {
		this.studentTel = studentTel;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public static String getCurrentLecture() {
		return currentLecture;
	}

	public static void setCurrentLecture(String currentLecture) {
		Student.currentLecture = currentLecture;
	}

	public String getLectureId() {
		return lectureId;
	}

	public void setLectureId(String lectureId) {
		this.lectureId = lectureId;
	}

	public String getLectureName() {
		return lectureName;
	}

	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}


	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getGetStudentInfo() {
		return getStudentInfo;
	}

	public void setGetStudentInfo(String getStudentInfo) {
		this.getStudentInfo = getStudentInfo;
	}

	public String getGetAllStudent() {
		return getAllStudent;
	}

	public void setGetAllStudent(String getAllStudent) {
		this.getAllStudent = getAllStudent;
	}

	public String getGetStudentById() {
		return getStudentById;
	}

	public void setGetStudentById(String getStudentById) {
		this.getStudentById = getStudentById;
	}

	public String getUpdateStudent() {
		return updateStudent;
	}

	public void setUpdateStudent(String updateStudent) {
		this.updateStudent = updateStudent;
	}

	public String getGetStudentId() {
		return getStudentId;
	}

	public void setGetStudentId(String getStudentId) {
		this.getStudentId = getStudentId;
	}

	public String getDeleteAllStudent() {
		return deleteAllStudent;
	}

	public void setDeleteAllStudent(String deleteAllStudent) {
		this.deleteAllStudent = deleteAllStudent;
	}

	public String getGetCurrentLecture() {
		return getCurrentLecture;
	}

	public void setGetCurrentLecture(String getCurrentLecture) {
		this.getCurrentLecture = getCurrentLecture;
	}

	public String getStudentId() {
		return studentId;
	}

	//강좌 조회용 필드 추가
	private String lectureId;
	private String lectureName;
	
	

	//회원가입용
	
	//사용자 조회
	private String getStudentInfo;
	
	//수강생 전체 조회
	private String getAllStudent;
	 //수강생 개별 조회
	private String getStudentById;

	//수강생 정보 수정
	private String updateStudent;

	//수강생 삭제
	private String getStudentId;
	
	//수강생 전체 삭제
	private String deleteAllStudent;
	
	//현재 수강 중인 강의
	private String getCurrentLecture;


	

	






	
}
