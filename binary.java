import java.util.Arrays;
class Check
{
 public static void main(String args[])
 {
	String str="hello all good morning";
	char a[]=str.toCharArray();
	Arrays.sort(a);
	char search='z';
	int f=0;
	int l=a.length-1;
	for(int x=0;x<a.length;x++)
	{
		 int m=(f+l)/2;
		if(search==a[m])
		{
			System.out.println("element found");
			break;
		}
		else if(search>a[m])
		{
			f=m+1;
		}
		else 
		{
			l=m-1;
		}
		
	}
 }