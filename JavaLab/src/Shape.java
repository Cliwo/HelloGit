
public abstract class Shape {
	
	private int id;
	
	public Shape()
	{
		
	}
	public int getId()
	{
		return id;
	}
	public void setId(int i)
	{
		id=i;
	}
	public double calculateArea()
	{
		return 1.0;
	}
	public double calculatePerimeter()
	{
		return 1.0;
	}
	public void printfInfo()
	{
		System.out.println("ID : " + getId());
	}
}
