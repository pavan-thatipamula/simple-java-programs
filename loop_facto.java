//print the factors of a number

class Loop
{
public static void main(String args[])
{
	int num=10;
	int start=1,end=num;
	while(start<=end)
	{
		if(num%start==0)
			System.out.println(start);
	start++;
	}
}
}