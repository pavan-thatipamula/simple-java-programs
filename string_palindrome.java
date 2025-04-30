class Check
{
 public static void main(String args[])
 {
	String s="alla";
	String rev="";
	for(int x=s.length()-1;x>=0;x--)
	{
		char letter=s.charAt(x);
		rev=rev+letter;
	}
	System.out.println(rev.equals(s)?"palindrome":"not palindrome");
 }
}