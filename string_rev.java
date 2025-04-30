class Reverse
{
 public static void main(String args[])
 {
	String s="hello";
	String rev="";
	for(int x=s.length()-1;x>=0;x--s)
	{
		char letter=s.charAt(x);
		System.out.println(letter);
		rev=rev+letter;
	}
	System.out.println("rev is "+rev);
	
 }
}