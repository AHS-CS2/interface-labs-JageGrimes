//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Arrays;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;
	private String name;

	//write a default Constructor
	public Monster()
	{
		myWeight = 0;
		myHeight = 0;
		myAge = 0;
		name = "Stupid";
	}
	//write an initialization constructor with an int parameter ht
	public Monster(int ht)
	{
		this();

		myHeight = ht;
	}
	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt)
	{
		this(ht);

		myWeight = wt;
	}
	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age)
	{
		this(ht, wt);

		myAge = age;
	}

	//modifiers - write set methods for height, weight, and age
	public void setHeight(int height)
	{
		myHeight = height;
	}
	public void setWeight(int weight)
	{
		myWeight = weight;
	}
	public void setAge(int age)
	{
		myAge = age;
	}
	public void setName(String nme)
	{
		name = nme;
	}
	
	
	//accessors - write get methods for height, weight, and age
	public int getHeight()
	{
		return myHeight;
	}
	public int getWeight()
	{
		return myWeight;
	}
	public int getAge()
	{
		return myAge;
	}
	public String getName()
	{
		return name;
	}
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster(myHeight, myWeight, myAge);
	}

	public boolean equals( Object obj )
	{
		return this.toString().equals( ((Monster) obj).toString());
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;

		if(this.getHeight() == rhs.getHeight())
		{
			if(this.getWeight() == rhs.getWeight())
			{
				if(this.getAge() == this.getAge())
				{
					return 0;
				}else
				{
					int big = Math.max(this.getAge(), rhs.getAge());

					if(big == this.getAge())
						return 1;
					else
						return -1;
				}
			}else
			{
				int big = Math.max(this.getWeight(), rhs.getWeight());

				if(big == this.getWeight())
					return 1;
				else
					return -1;
			}
		}else
		{
			int big = Math.max(this.getHeight(), rhs.getHeight());

			if(big == this.getHeight())
				return 1;
			else
				return -1;
		}
	}

	//write a toString() method
	
	public String toString()
	{
		return myHeight + " " + myWeight + " " + myAge;
	}
	
}