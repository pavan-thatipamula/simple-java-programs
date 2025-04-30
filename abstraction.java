class pavan
{
	public static void main(String args[])
	{
		child c=new child();
		c.m1();
		c.add();
		
		
	}
}
class child extends parent
{
	public void m1()
	{
		System.out.println("am m1 method");
	}
	public void add()
	{
		int s=a+b;
		System.out.println(s);
	}
	

}
abstract class parent
{
	int a,b;
	parent()
	{
		a=10;
		b=20;
	}
	/* abstract int add()
	{
		int s=a+b;
		return s;
	}
	 abstract int sub()
	{
		int s=a-b;
		return s;
	}
	 abstract int div()
	{
		int div=a%b;
		return div;
	}*/
}