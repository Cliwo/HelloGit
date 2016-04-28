//Cliwo Á¤½ÂÂù , student ID : 201520926 , Email: cliwo@naver.com

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
	
	public void printInfo()
	{
		System.out.println("ID : " + getId());
	}
}
