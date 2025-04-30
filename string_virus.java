import java.util.Arrays;
class Check
{
 public static void main(String args[])
 {
	String s="vital  information rescourses under sieze";
	String str[]=s.split(" ");
	for(String t:str)
	{
		String sin=t;
		char bin[]=sin.toCharArray();
		for(int n:bin)
		{
			System.out.println(sin.charAt(0));
			break;
		}
	}
 }
}