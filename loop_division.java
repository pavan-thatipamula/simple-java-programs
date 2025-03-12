class Check
{
public static void main(String args[])
{
	int start=1,end=100,count=0;
	while(start<=end)
		{
			int num=start;
			if(num%3==0 && num%5==0)
				{
				System.out.println(num);
				count++;
				}
		start++;
		}
		System.out.println(count+" total count");
}
}