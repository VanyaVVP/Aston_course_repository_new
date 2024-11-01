public class Person {
private String name,middle_name,last_name,job_title,email,number_phone;
private int salary,age;

	public Person(String name, String middle_name, String last_name, String job_title, String email, String number_phone, int salary, int age) {
	this.name = name;
	this.middle_name = middle_name;
    this.last_name = last_name;
    this.job_title = job_title;
	this.email = email;
	this.number_phone = number_phone;
	this.salary = salary; 
	this.age = age;	 
	}
	void printInfo() {
	System.out.println("Name: " + name + "\n" + "Middle name: " + middle_name + "\n" + "Last name: " + last_name + "\n" + "Status: " + job_title + "\n" + "Email: " + email + "\n" + "Phone number: " + number_phone + "\n" + "Salary: " + salary + "\n" + "Age: " + age + "\n" );
	}
		}