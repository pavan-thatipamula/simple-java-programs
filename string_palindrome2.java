class Check
{
 public static void main(String args[])
 {
	String s="a1b2c321";
	String digit="";
	String rev="";
	for(int x=0;x<s.length();x++)
	{
		char letter=s.charAt(x);
		if(letter>='0' && letter<='9')
		{
			digit=digit+letter;
		}
	}
	for(int x=digit.length()-1;x>=0;x--)
	{
		char letter=digit.charAt(x);
		rev=rev+letter;
	}
	System.out.println(digit.equals(rev)?"palindrome":"not palindrome");
	
 }
}