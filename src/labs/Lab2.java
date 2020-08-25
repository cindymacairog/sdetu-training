package labs;

public class Lab2 {

	public static void main(String[] args) {
		
	 Student stud1 = new Student("Alex","982354379");
	 Student stud2 = new Student("Michael","908723241");
	 Student stud3 = new Student("Linc","986443589");
	 
	 stud1.enroll("CS422");
	 stud1.enroll("CS311");
	 stud1.enroll("ARCH322");
	 
//	 stud1.showCourses();
//	 stud1.checkBalance();
	 stud1.pay(2000);
//	 stud1.checkBalance();
	 System.out.println(stud1.toString()); 
	}

}

class Student{
	private static int iD = 0;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance;
	
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		setEmail();
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "." + iD+ "@sdetuniversity.com";
		System.out.println("Email address: " + email);
	}
	
	public String getEmail() {
		return email;
	}
	
	private void setUserId() {
		int setMax = 9000;
		int setMin = 1000;
		int randomNum = (int) (Math.random()*((setMax - setMin)));
		randomNum = randomNum + setMin; 
		userId = iD + "" + randomNum + ssn.substring(5);
		System.out.println("User ID: " + userId);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + "\n" + course;
		balance = balance + costOfCourse;
	}
	public void pay(int amount) {
		System.out.println("Payment: $" + amount);
		balance = balance - amount;
		
	}
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	public void showCourses() {
		System.out.println(courses);
		
	}
	public String toString() {
		return "[NAME: " + name + "] \n[COURSES: " + courses + "] \n[BALANCE: " +
				balance + "]";
	}
}
