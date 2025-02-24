class Square
{
public static void main(String args[])
{
	int num = 24;
	double num2 = Math.sqrt(num);
	double num3 = num2*num2;
	if(num==num3)
	{
		System.out.println(num + " is perfect square");
	}
	else
	{
		System.out.println(num + " is not a perfect square");
	}
}
	
}