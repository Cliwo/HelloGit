
public class Triangle extends Shape {
	private double side1;
	private double side2;
	private double side3;

	public double calculateArea() {
		if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
			return 0;
		}
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

	public double calculatePerimeter() {
		if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
			return 0;
		}

		return side1 + side2 + side3;
	}

	public Triangle(double side1, double side2, double side3) {
		super();
		
		if (side1+side2<=side3 || side1+side3<=side2 || side3+side2<=side1){
			System.out.println("Invalid input");
			return;
		}
		
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		if (side1<=0){
			return;
		}
		this.side1 = side1;
	}

	public double getSide2() {

		return side2;
	}

	public void setSide2(double side2) {
		if (side2<=0){
			return;
		}
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		if (side3<=0){
			return;
		}
		this.side3 = side3;
	}

	@Override
	public void printInfo() {
		  System.out.print("Triangle with an ID of "+ getId()); 
	  	  System.out.format(", sides of %.6f, %.6f and %.6f, ",side1, side2, side3);
	  	  System.out.format("area of %.6f, and ", calculateArea());
	  	  System.out.format("perimeter of %.6f.",calculatePerimeter());
	  	  System.out.println();
	}
}
