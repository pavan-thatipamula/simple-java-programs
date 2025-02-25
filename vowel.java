//Q : take input a character, check whether it is vowel or consonant

//METHOD 1

class Alphabets
{
public static void main(String args[])
{
	char alphabet='y';
	if(alphabet=='a')
	{
		System.out.println(alphabet +" is vowel");
	}
	if(alphabet=='e')
	{
		System.out.println(alphabet +" is vowel");
	}
	if(alphabet=='i')
	{
		System.out.println(alphabet +" is vowel");
	}
	if(alphabet=='o')
	{
		System.out.println(alphabet +" is vowel");
	}
	if(alphabet=='u')
	{
		System.out.println(alphabet +" is vowel");
	}
	else
	{
		System.out.println(alphabet +" is consonant");	
	}
}
}

//---------------------METHOD 2-------------------

class Alphabets2
{
public static void main(String args[])
{
	char alphabet='A';
	if(alphabet=='a' || alphabet=='e' ||alphabet=='i'||alphabet=='o'||alphabet=='u'||alphabet=='A' || alphabet=='E' ||	alphabet=='I'||alphabet=='O'||alphabet=='U')
	{
		System.out.println(alphabet+" is a vowel");
	}
	else
	{
		System.out.println(alphabet+" is a consonant");	
	}
}
}




















