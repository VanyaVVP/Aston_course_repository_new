import java.util.Scanner;
class Cat extends Animals {
  private int maxRunDistance;
  private static Cat[] cats;
  private boolean satietyCat = false; // считаем, что 1 кот наедается 5 позициями еды
  public Cat() {
    super();
    this.maxRunDistance = 200; 
    totalAnimalCount++;
  }

  public static void createCats(Scanner scanner) {     //создание массива котов 
      int catCount = new Animals().inputAnimal("котов", scanner); 
      cats = new Cat[catCount];  
      for (int i = 0; i < catCount; i++) { 
          cats[i] = new Cat(); 
      } 
  }
  public static boolean canRun(int distanceRun) {     // Определяет, может ли пробежать
      return distanceRun <= new Cat().maxRunDistance;
  }
  
  public static void addFood(int foodAmount) {
      Animals.plate += foodAmount;
  }
  
  public void eat() {         // метод кормления кота
      if (Animals.plate >= 5 && !satietyCat) { 
          Animals.plate -= 5; 
          satietyCat = true; 
      }
  }
  
  public static void feedAllCats() {     // метод кормления всех котов
      for (int i = 0; i < cats.length; i++) { 
          Cat cat = cats[i]; 
          if (Animals.plate >= 5 && !cat.satietyCat) { 
              cat.eat(); 
              System.out.println("Кот " + (i + 1) + " " + (cat.satietyCat ? "сыт" : "голодный")); 
          } else { 
              System.out.println("Кот " + (i + 1) + " " + (cat.satietyCat ? "сыт" : "голодный")); 
          } 
      } 
  }
}
