package week3.day1;

public class Students {
		public void GetStudentInfo(int id) {
			System.out.println("Student id is :" + id);
		}
		public void GetStudentInfo(int id, String name) {
			System.out.println("Student id is :" + id);
			System.out.println("Student name is :" + name);
		}
		public void GetStudentInfo(String email, int phno) {
			System.out.println("Student email is :" + email);
			System.out.println("Student phoneno is :" + phno);
		}
		

	public static void main(String[] args) {
		Students stu = new Students();
		stu.GetStudentInfo(5);
		stu.GetStudentInfo(10, "Ram");
		stu.GetStudentInfo("acd@gmail.com", 123456789);
	}

}
