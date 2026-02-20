//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class MonsterRunner2
{
	public static void main( String args[] )
	{

		Scanner kb = new Scanner(System.in);
		for(int i = 0; i < 3; i++)
		{
			//ask for name and size
			System.out.print("Enter 1st monster's name : ");
			String name = kb.next();
			System.out.print("Enter 1st monster's size : ");
			int size = kb.nextInt();
			//instantiate monster one
			Skeleton skell = new Skeleton(size, name);

			System.out.print("Enter 2nd monster's name : ");
			name = kb.next();
			System.out.print("Enter 2nd monster's size : ");
			size = kb.nextInt();
			//instantiate monster one
			Skeleton skell2 = new Skeleton(size, name);

			System.out.println("\n"+skell);
			System.out.println(skell2);

			System.out.println("\nMonster one is smaller than Monster two :: " + skell.isSmaller(skell2));
			System.out.println("Monster one is bigger than Monster two :: " + skell.isBigger(skell2));
			System.out.println("Monster one has the same name as Monster two :: " + skell.namesTheSame(skell2));

		}

		kb.close();
		
	}
}