public class Circle extends Shape{
	  private double radius;
	  
	  public double getRadius() {
			return radius;
      }
      
	  public void setRadius(double radius) {
			if(radius<0)
				return;
			this.radius = radius;
 	  }
       
      public double calculateArea() {
           return Math.PI * radius * radius;
	  }
		 
	  public double calculatePerimeter() {
		   
           return Math.PI * 2 * radius;
	  }
	  
      public Circle(double r){
		 if(r<0)
			 return;
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
