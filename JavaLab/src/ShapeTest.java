import java.util.ArrayList; 
public class ShapeTest {

	public ShapeTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeTest prototype = new ShapeTest();
		
		prototype.start();

	}
	
	public void start(){
		int i;
		ArrayList<Shape> shapeArr= new ArrayList<Shape>();
		
		Rectangle rec= new Rectangle(13, 7);
		rec.setId(1);
		shapeArr.add(rec);
		
		Circle cir= new Circle(18);
		cir.setId(2);
		shapeArr.add(cir);
		
		Triangle tri= new Triangle(5, 9, 12);
		tri.setId(3);
		shapeArr.add(tri);
		
		for (i=0; i<shapeArr.size(); i++){
			processShape(shapeArr.get(i));
		}
		
		

		
	}
	
	public void processShape(Shape x){
	//
		x.printInfo();
		
		if (x instanceof Rectangle){
			x= (Rectangle) x;
			((Rectangle) x).drawRectangle();
		}
	}
}
