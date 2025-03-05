class Leap
{
public static void main(String args[])
{
	int start=1600,end=2000;
	while(start<=end)
		{
		int num=start;
		if(num%4==0&&num%100!=0||num%400==0)
			if(num%6==0)
				System.out.println(num);
		start++;
		}
}
}