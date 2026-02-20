//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public interface Monster_i {
	public int getHowBig();

	public String getName();

	public boolean isBigger(Skeleton other);

	public boolean isSmaller(Skeleton other);

	public boolean namesTheSame(Skeleton other);
}