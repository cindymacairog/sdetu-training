package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walk () {
		System.out.println(name + " is walking");
	}
	void sleep () {
		System.out.println(name + " is sleeping");
	}
	void eat () {
		System.out.println(email);
	}
}

public class Demo {

	public static void main(String[] args) {
		//Instantiating an object
		Person person1 = new Person();
		person1.name = "Mahone";
		person1.email = "mahone@testemail.com";
		person1.phone = "9628121";
		
		//Define props
		person1.walk();

		Person person2 = new Person();
		person2.name = "Michael";
		person2.sleep();
		
		/*
		//Attributes,  variables, adj,
		String name = "Mahone";
		String email = "mahone@testemail.com";
		String phone = "98754435682";
		
		String name2 = "Michael";
		String email2 = "michael@testemail.com";
		String phone2 = "9875443345";
		
		//Action, activity
		walking(name);
		walking(name2);
	}
	static void walking(String name) {
		System.out.println(name + " is walking");
		*/
		
		
	}

}
