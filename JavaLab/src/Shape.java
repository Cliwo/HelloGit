
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
	abstract public double calculateArea();
	abstract public double calculatePerimeter();
	public void printfInfo()
	{
		System.out.println("ID : " + getId());
	}
}
