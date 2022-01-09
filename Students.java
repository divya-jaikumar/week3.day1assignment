package overloadingstudents;

	public class Students {
		public void getStudentInfo(int id) {
			System.out.println("My id is..."+id);
			
		}
	public void getStudentInfo(int id,String name) {
		System.out.println("Fetching name with id"+" "+name+" "+id);

		}
	public void getStudentInfo(String email,long phonenum) {
		System.out.println("contact details are"+" "+email+" "+phonenum);
	}
	public static void main(String[] args) {
		Students s1=new Students();
		s1.getStudentInfo(100);
		s1.getStudentInfo(100, "Divya");
		s1.getStudentInfo("abc@gmail.com", 8056273241L);

	}

}
