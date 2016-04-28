public class Circle extends Shape{
	  private double radius;
	  
     

	  public double getRadius(double radius) {
			return radius;
      }
      
	  public void setSide1(double radius) {
			this.radius = radius;
 	  }
       
      public double calculateArea() {
		   if (radius<=0) {
				return 0;
           }
           return Math.PI * radius * radius;
	  }
		 
	  public double calculatePerimeter() {
		   if (radius<=0) {
				return 0;
           }
           return Math.PI * 2 * radius;
	  }
	  
      public Circle(double r){
		 radius = r;
	  }
      
      @Override
      public void printInfo()
      {
    	  System.out.print("Circle with an ID of "+getId()); 
    	  System.out.format(", radius of %.6f, ",radius);
    	  System.out.format("area of %.6f, and",calculateArea());
    	  System.out.format("perimeter of %.6f.",calculatePerimeter());
    	  System.out.println();
      }
}
