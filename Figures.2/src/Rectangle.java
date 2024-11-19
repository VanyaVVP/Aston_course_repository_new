class Rectangle implements Shape {
		  private double width;
		  private double height;
		  private String fillColor;
		  private String borderColor;

		  public Rectangle(double width, double height, String fillColor, String borderColor) {
		    this.width = width;
		    this.height = height;
		    this.fillColor = fillColor;
		    this.borderColor = borderColor;
		  }

		  public double calculatePerimeter() {
		    return 2 * (width + height);
		  }

		  public double calculateArea() {
		    return width * height;
		  }

		  public String getFillColor() {
		    return fillColor;
		  }

		  public String getBorderColor() {
		    return borderColor;
		  }
		  public void print() {
			  System.out.println("Периметр: " + calculatePerimeter());
				System.out.println("Площадь: " + calculateArea());
				System.out.println("Цвет заливки: " + getFillColor());
				System.out.println("Цвет границы: " + getBorderColor());  
		  }
		}