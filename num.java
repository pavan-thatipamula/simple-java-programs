//Q:take two numbers,which is greater,print the greater

class NUM
{
public static void main(String args[])
{
	int a=10;
	int b=20;
	if(a>b)
	{
		System.out.println(a+" is greater");
	}
	else if(a==b)
	{
		System.out.println("both are equal");
	}
	else
	{
		System.out.println(b+" is greater");
	}
}
}

//---------method 2------------------

class NUM2
{
public static void main(String args[])
	{
		int a=30;
		int b=30;
		String res = (a>b)? a + " IS GREATER":(a<b)? b + "is greater":"equal";
		System.out.println(res);
	}
}













