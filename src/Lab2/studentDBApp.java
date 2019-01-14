package Lab2;

public class studentDBApp {

	public static void main(String[] args) {
		
		studentDB student1 = new studentDB("John", "894264319");
		
		student1.setPhone("0815973649");
		student1.setCity("Miami");
		student1.setState("Florida");
		
		student1.showCourses("Java Software Development");
		
		student1.enroll(3000);
		student1.pay(500);
		
		System.out.println(student1.toString());
		

	}

}

class studentDB{
	private static int iD = 0;
	private String name;
	private String SSN;
	private String phone;
	private String city;
	private String state;
	private double balance;
	
	
	public studentDB(String name, String SSN) {
		iD++;
		this.name = name;
		this.SSN = SSN;
		emailID();
		userID();
	}
	
	public void emailID() {
		String email = name+"@sdet.com";
		System.out.println("Email ID is: "+email);
	}
	
	public void userID() {
		int random = (int) (((Math.random()*9000)+1000));
		String userID = iD + "" + random + "" + SSN.substring(5,9);
		System.out.println("User ID is: "+userID);
	}
	
	public void enroll(double enrollFee) {
		balance = enrollFee;
		System.out.println("Enroll Fee: "+enrollFee);
	}
	
	public void pay(double amount) {
		balance = balance - amount;
		System.out.println("Paid: "+amount);
		checkBalance();
	}
	
	public void checkBalance() {
		System.out.println("The Balance is: "+balance);
	}
	
	public void showCourses(String course) {
		System.out.println("Courses: "+course);
	}
	
	@Override
	public String toString() {
		return "[ Student Name: "+name+" ]\n[ SSN: "+SSN+" ]\n[ Fee Balance: "+balance+" ]";
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
}
