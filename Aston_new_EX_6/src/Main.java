import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Employee empl_1 = new Employee("Никита", "Сергеевич", "Королёв", "middle", "korolev.01@mail.ru", "89856745896", 175000, 26);  //Employee - Ex № 1
	    Employee empl_2 = new Employee("Иван", "Викторович", "Туркин", "middle", "Turkin.01@mail.ru", "89855896896", 150000, 24);
		empl_1.printInfo();
	    empl_2.printInfo();
	    Person[] persArray = new Person[2];                                                                                           //Person - Ex № 2
	    persArray[0] = new Person("Alexey", "Ivanovich", "Petrov", "middle", "petrov.alexey@mail.ru", "89234567890", 200000, 28);
	    persArray[1] = new Person("Maria", "Sergeevna", "Smirnova", "middle", "smirnova.maria@mail.ru", "89451234567", 180000, 30);
	    for(int i = 0; i<persArray.length; i++)
	    {
	    	persArray[i].printInfo();
	    }
	
	Scanner scanner = new Scanner(System.in);     //Park - Ex № 3
	System.out.println("Введите желамое кол-во аттракционов: ");
	int array = scanner.nextInt();
	scanner.nextLine(); 
	if (array <= 0){ 
		System.out.print("Аттракционов в парке нет ");
	} else {
	Park park = new Park();	 
	Park.Attraction[] attraction = new Park.Attraction[array]; 
	for (int i = 0; i < attraction.length; i++) {
        System.out.println("Введите данные об аттракционе " + (i + 1) + ":");
        
        attraction[i] = park.new Attraction();
        
        System.out.print("Название: ");
        attraction[i].attraction_name = scanner.nextLine();

        System.out.print("Время окончания работы: ");
        attraction[i].finishing_work = scanner.nextLine();
        
        System.out.print("Возрастное ограничение: ");
        try {
            attraction[i].age_limit = scanner.nextInt();
            scanner.nextLine(); 
        } catch (InputMismatchException e) {
            attraction[i].alert();
            scanner.nextLine(); 
            i--; 
            continue; 
        }

        System.out.print("Цена билета: "); 
        try {
            attraction[i].price_per_ticket = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
        	attraction[i].alert();
            scanner.nextLine(); 
            i--; 
            continue; 
        }      
    }
	scanner.close();
	Park p_n = new Park();
	p_n.park_name();
	for (Park.Attraction att : attraction) { 
	       att.printInfo();
	  }
	 }
	}
   }