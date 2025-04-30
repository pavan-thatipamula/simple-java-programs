class Check
{
 public static void main(String args[])
 {
	String s="ApPlE @1 f";
	String res="";
	for(int x=0;x<s.length();x++)
	{
		char letter=s.charAt(x);
		if(letter>='a' && letter <='z')
		{
			res=res+(char)(letter-32);
		}
		else if(letter>='A' && letter<='Z')
		{
			res=res+(char)(letter+32);
		}
		else 
			res=res+letter;
	}
	System.out.println(res);
 }
}