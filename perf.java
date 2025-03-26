class Pavan
{
public static void main(String args[])
{
	Demo d1=new Demo();
	int res=d1.isPalindrome(1001);
	System.out.println(d1.Check(res,1001));
}
}
class Demo
{
	int isPalindrome(int x)
{
	int rev=0,temp=x;
	while(temp!=0)
	{
		int rem=temp%10;
		rev=rev*10+rem;
		temp/=10;
	}
	return rev;
}
	
	String Check(int rev,int x)
	{
		if(rev==x)
			return "palindrome";
		else
			{
			return "no";
			}
	}

}
