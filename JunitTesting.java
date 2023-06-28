package Day4;

public class JunitTesting {

	public int square(int a)
	{
		return a*a;
	}
	
	public static int countA(String word)
	{
		int count = 0;
		for(int i =0; i < word.length(); i++)
		{
			if(word.charAt(i)=='a' || word.charAt(i)=='A')
				count++;
		}
		return count;
	}
	
}
