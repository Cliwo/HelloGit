
public class Rectangle extends Shape {
	public double width;
	public double height;

	public Rectangle(double width, double height) {

		this.width = width;
		this.height = height;
	}

	public double calculateArea() {
		if (width < 0 && height < 0) {
			System.out.println("Invalid values");
			return 0;
		}

		return width * height;

	}

	public double calculatePerimeter() {

		if (width < 0 && height < 0) {
			System.out.println("Invalid values");
			return 0;
		}

		return 2 * width + 2 * height;

	}

	public void drawRectangle(int x, int y) {
		for (int m = 0; m < x; m++) {
			for (int n = 0; n < y; n++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();

	}

	public void printInfo() {
	  System.out.print("Rectangle with an id of "+getId()); 
  	  System.out.format("width of %.6f",width);
  	  System.out.format("height of %.6f",height); 
  	  System.out.format("area of %.6f and ", calculateArea());
  	  System.out.format("perimeter of %.6f",calculatePerimeter());
  	  System.out.println();
	}

}
