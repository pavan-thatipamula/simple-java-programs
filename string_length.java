class Check
{
	public static void main(String args[])
	{
		String s="hello world";
		System.out.println(s.length()+" is length of string");
		for(int x=s.length()-1;x>=0;x--)
		{
			char l=s.charAt(x);
			System.out.println(l);
		}
	}
}