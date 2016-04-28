public class Circle {
	  private double radius;
	  
      double pi = 3.14;

	  public double getRadius(double radius) {
			return radius;
      }
      
	  public void setSide1(double radius) {
			this.radius = radius;
 	  }
       
      public double calculateArea(double radius) {
		   if (radius<=0) {
				return 0;
           }
           return pi * radius * radius;
	  }
		 
	  public double calculatePerimeter(double radius) {
		   if (radius<=0) {
				return 0;
           }
           return pi * 2 * radius;
	  }
      public void Circle(){
		  System.out.println(calculateArea(10.0));
          System.out.println(calculatePerimeter(10.0));
	  }
}
