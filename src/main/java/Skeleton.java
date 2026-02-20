//(c) A+ Computer Science
//www.apluscompsci.com
//Name -



public class Skeleton implements Monster_i {
	// add instance variables
	private int size;
	private String name;

	// add a constructor
	public Skeleton(int s, String n)
	{
		size = s;
		name = n;
	}

	// add code to implement the Monster interface

	public int getHowBig()
	{
		return size;
	}

	public String getName()
	{
		return name;
	}

	public boolean isBigger(Skeleton other)
	{
		return this.getHowBig() - other.getHowBig() > 0;
	}

	public boolean isSmaller(Skeleton other)
	{
		return this.getHowBig() - other.getHowBig() < 0;
	}

	public boolean namesTheSame(Skeleton other)
	{
		return other.getName().equals(this.name);
	}

	// add a toString
	public String toString()
	{
		return name + " " + size;
	}
}