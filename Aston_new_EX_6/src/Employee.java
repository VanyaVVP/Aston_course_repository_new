public class Employee {
  private String name,middle_name,last_name,job_title,email,number_phone;
  private int salary,age;

    public Employee(String name, String middle_name, String last_name, String job_title, String email, String number_phone, int salary, int age) {
    this.name = name;
    this.middle_name = middle_name;
    this.last_name = last_name;
    this.job_title = job_title;
    this.email = email;
    this.number_phone = number_phone;
    this.salary = salary; 
    this.age = age;
  }
  public void printInfo() {
	    System.out.println("Имя: " + name + "\n" + "Отчество: " + middle_name + "\n" + "Фамилия: " + last_name + "\n" + "Должность: " + job_title + "\n" + "Электронная почта: " + email + "\n" + "Номер телефона: " + number_phone + "\n" + "Зарплата: " + salary + "\n" + "Возраст: " + age + "\n" );
	  }
}