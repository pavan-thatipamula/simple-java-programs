import java.io.FileReader;
import java.io.Exception;
class Check

{
	public static void main(String args[]) 
	{
		int num=0;
		try
		{
			System.out.println(10/0);
			System.out.println("in try");
		}catch(Exception e)
		{
			System.out.println("exception is handled. "+(num++));
		}
	}
}
