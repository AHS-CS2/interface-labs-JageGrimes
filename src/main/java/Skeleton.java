//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

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

	public boolean isBigger(Monster other)
	{
		return other.compareTo(this) == 0 ? false : other.compareTo(this) > 0;
	}

	public boolean isSmaller(Monster other)
	{
		return other.compareTo(this) == 0 ? false : other.compareTo(this) < 0;
	}

	public boolean namesTheSame(Monster other)
	{
		return other.getName().equals(name);
	}

	// add a toString
	public String toString()
	{
		return name + " " + size;
	}
}