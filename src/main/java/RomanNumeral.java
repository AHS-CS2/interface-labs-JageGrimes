//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class RomanNumeral implements Comparable<RomanNumeral>
{
	private Integer number;
	private String roman;
	private boolean isNumberSent; // true if sent in number, false if not

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};


	public RomanNumeral()
	{
		roman = "";
		number = 0;
	}
	public RomanNumeral(String str)
	{
		this();
		isNumberSent = false;
		roman += str;
		for(int i = 0; i < LETTERS.length; i++)
		{
			while(str.length() > 1)
			{
				if(str.indexOf(LETTERS[i]) == 0)
				{
					number += NUMBERS[i];
					str = str.substring(LETTERS[i].length());
				}
			}
		}
	}

	public RomanNumeral(Integer orig)
	{
		this();
		number += orig;

		isNumberSent = true;

		int origional = orig;

		for(int i = 0; i < NUMBERS.length; i++)
		{
			while(origional >= NUMBERS[i])
			{
				roman += LETTERS[i];
				origional -= NUMBERS[i];
			}
		}
	}

	//write a set number method
	public void setNumber(Integer num)
	{
		number = num;
	}
	
	//write a set roman method
	public void setRoman(String str)
	{
		roman = str;
	}


	//write get methods for number and roman
	public int getNumber()
	{
		return number;
	}

	public String getRoman()
	{
		return roman;
	}
	
	

	public int compareTo(RomanNumeral r)
	{
		return this.getNumber() - r.getNumber();
	}

	//write  toString() method
	public String toString()
	{
		return isNumberSent ? roman : number + "";
	}
	
	
	
}