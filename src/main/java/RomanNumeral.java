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
		setRoman(str);
	}
	public RomanNumeral(Integer orig)
	{
		this();
		setNumber(orig);
	}

	//write a set number method
	public void setNumber(Integer num)
	{
		roman = "";
		number = 0;
		number += num;

		isNumberSent = true;

		for(int i = 0; i < NUMBERS.length; i++)
		{
			while(num >= NUMBERS[i])
			{
				roman += LETTERS[i];
				num -= NUMBERS[i];
			}
		}
	}
	//write a set roman method
	public void setRoman(String str)
	{
		isNumberSent = false;
		roman = "";
		number = 0;
		roman += str;
		for(int i = 0; i < LETTERS.length; i++)
		{
			while(str.indexOf(LETTERS[i]) == 0)
			{
				number += NUMBERS[i];
				str = str.substring(LETTERS[i].length());
			}
		}
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