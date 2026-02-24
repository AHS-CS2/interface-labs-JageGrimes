//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	// SORT BY LENGTH
	// public int compareTo( Word rhs )
	// {		
	// 	if(this.toString().length() - rhs.toString().length() == 0)
	// 	{
	// 		return word.compareTo(rhs.toString());
	// 	}else
	// 	{
	// 		return this.toString().length() - rhs.toString().length();
	// 	}
	// }


	// SORT BY VOWLES
	public int compareTo( Word rhs )
	{		
		int vowlesThis = 0; // this object
		int vowlesThat = 0; // rhs object

		for(char let : this.toString().toCharArray())
		{
			String letter = let + "";

			if(letter.matches("[aeiouAEIOU]"))
			{
				vowlesThis++;
			}
		}

		for(char let : rhs.toString().toCharArray())
		{
			String letter = let + "";

			if(letter.matches("[aeiouAEIOU]"))
			{
				vowlesThat++;
			}
		}

		if(vowlesThis == vowlesThat)
		{
			return this.toString().compareTo(rhs.toString());
		}else
		{
			return vowlesThis - vowlesThat;
		}
	}

	public String toString()
	{
		return word;
	}
}