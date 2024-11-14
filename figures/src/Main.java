import java.util.Scanner;
public class Main {

 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 String fillColor;
	 String borderColor;
	 System.out.print("Введите тип фигуры (круг, прямоугольник, треугольник): ");
	 String shapeType = scanner.nextLine();

	 Shape shape = null;
	 
     switch (shapeType) {
    
     case("круг"):
	 System.out.print("Введите радиус круга: ");
	 double radius = scanner.nextDouble();
	 scanner.nextLine(); 
	 System.out.print("Введите цвет заливки: ");
	 fillColor = scanner.nextLine();
	 System.out.print("Введите цвет границы: ");
	 borderColor = scanner.nextLine();
	 shape = new Circle(radius, fillColor, borderColor);
	 break;
	
     case("прямоугольник"):
	 System.out.print("Введите ширину прямоугольника: ");
	 double width = scanner.nextDouble();
	 scanner.nextLine(); 
	 System.out.print("Введите высоту прямоугольника: ");
	 double height = scanner.nextDouble();
	 scanner.nextLine(); 
	 System.out.print("Введите цвет заливки: ");
	 fillColor = scanner.nextLine();
	 System.out.print("Введите цвет границы: ");
	 borderColor = scanner.nextLine();
	 shape = new Rectangle(width, height, fillColor, borderColor);
	 break;
	
     case("треугольник"):
	 System.out.print("Введите сторону 1 треугольника: ");
	 double side1 = scanner.nextDouble();
	 scanner.nextLine(); 
	 System.out.print("Введите сторону 2 треугольника: ");
	 double side2 = scanner.nextDouble();
	 scanner.nextLine(); 
	 System.out.print("Введите сторону 3 треугольника: ");
	 double side3 = scanner.nextDouble();
	 scanner.nextLine(); 
	 System.out.print("Введите цвет заливки: ");
	 fillColor = scanner.nextLine();
	 System.out.print("Введите цвет границы: ");
	 borderColor = scanner.nextLine();
	 shape = new Triangle(side1, side2, side3, fillColor, borderColor);
     }
     
	 if (shape != null) {
		System.out.println("Периметр: " + shape.calculatePerimeter());
		System.out.println("Площадь: " + shape.calculateArea());
		System.out.println("Цвет заливки: " + shape.getFillColor());
		System.out.println("Цвет границы: " + shape.getBorderColor());
		} 
	 else {
			System.out.println("Неверный тип фигуры.");
	}

	scanner.close();
		}
	  }