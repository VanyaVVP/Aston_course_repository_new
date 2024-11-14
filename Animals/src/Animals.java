import java.util.Scanner;
public class Animals {
  public static int totalAnimalCount = 0;
  public static int plate = 10;
  public int inputAnimal(String type, Scanner scanner) { // метод для ввода кол-ва котов и собак
      System.out.println("Введите кол-во " + type + ": ");
      int array = scanner.nextInt();
      scanner.nextLine();
      return array;
  }
  
  public static void main(String[] args) {
	int distanceRun = 500;
	int distanceSwim = 11;
	try (Scanner scanner = new Scanner(System.in)) { 
        Cat.createCats(scanner); 
        Dog.createDogs(scanner); 
	}
    Cat.addFood(5); // добавление еды в миску
    Cat.feedAllCats(); //кормление всех котиков
    System.out.println("Общее количество животных: " + totalAnimalCount);  // общее кол-во животных (кошек и собак)
    System.out.println("Собака сможет пробежать " + distanceRun + " метров: " + Dog.canRun(distanceRun));   // сколько могут пробежать собаки 
    System.out.println("Собака сможет проплыть " + distanceSwim + " метров: " + Dog.canSwim(distanceSwim)); // сколько могут проплыть собаки
    System.out.println("Кот сможет пробежать " + distanceRun + " метров: " + Cat.canRun(distanceRun)); // сколько могут пробежать кошки
    System.out.println("В миске " + Animals.plate + " единиц еды"); // вывод оставшейся еды
}}
