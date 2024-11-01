public class Park {                

	public String park = "The best park ever";
	public void park_name() {
		System.out.println("Парк: " + park);
	}
	
	public class Attraction {                 
	public String attraction_name;
	public String finishing_work;
	public int age_limit;
	public int price_per_ticket;
	
	public void printInfo() {   
	      System.out.println("Аттракцион: " + attraction_name + ", Окончание работы: " + finishing_work + 
	          ", Возрастное ограничение: с " + age_limit + " лет" + ", Цена: " + price_per_ticket);
	    }
	public void alert() {
		System.out.println("Некорректный ввод! Введите число.\n");	
	}
	  }}