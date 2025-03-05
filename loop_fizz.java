class Fizz
{
public static void main(String args[])
{
	int start=1,end=100;
	while(start<=end)
	{
		if(start%3==0 && start%5==0)
			System.out.println(start+" fizz buzz");
		else if(start%3==0)
			System.out.println(start+" fizz");
		else if(start%5==0)
			System.out.println(start+" buzz");
		else
			System.out.println(start);
		start++;
	}
}
}