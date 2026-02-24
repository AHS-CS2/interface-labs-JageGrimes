//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("src\\main\\java\\words.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		ArrayList<Word> organize = new ArrayList<>();

		for(int i = 0; i < size; i++)
		{
			organize.add(new Word(file.nextLine()));
		}

		organize.sort(null);

		for(Word word : organize)
		{
			System.out.println(word);
		}
	}
}