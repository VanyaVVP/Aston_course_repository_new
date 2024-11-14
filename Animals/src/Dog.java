import java.util.Scanner;
class Dog extends Animals {
  private int maxRunDistance;
  private int maxSwimDistance;
  public Dog() {
    super();
    this.maxRunDistance = 500;
    this.maxSwimDistance = 10;
    totalAnimalCount++;
  }

  public static void createDogs(Scanner scanner) { 
      int dogCount = new Animals().inputAnimal("собак", scanner);
      Dog[] dogs = new Dog[dogCount];         //создание массива собак 
      for (int i = 0; i < dogCount; i++) { 
          dogs[i] = new Dog(); 
      } 
  }
  public static boolean canRun(int distanceRun) {   // Определяет, может ли пробежать
      return distanceRun <= new Dog().maxRunDistance;
  }
  
  public static boolean canSwim(int distanceSwim) {     // Определяет, может ли проплыть
	return distanceSwim <= new Dog().maxSwimDistance;  
  }
}
