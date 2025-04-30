class check
{
 public static void main(String args[])
 {
	String s="Hello world @123";
	int digit=0,small=0,space=0,vowel=0,consonant=0,capital=0,symbol=0;

	for(int x=0;x<s.length();x++)
	{
		char letter=s.charAt(x);
		if(letter>='0' && letter<='9')
			{
				digit++;

			}
		else if(letter==' ')
			{
    			space++;
			}
		else if(letter>='a' && letter<='z')
			{
				small++;
				if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
				{
					vowel++;
				}
				else
				{
					consonant++;
				}
	
			}
		else if(letter>='A' && letter<='Z')
			{
				capital++;
				if(letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')
				{
					vowel++;
				}
				else
				{
					consonant++;
				}
	
			}
		else
			symbol++;
	}
	System.out.println("digits"+digit);
	System.out.println("small"+small);
	System.out.println("capital"+capital);
	System.out.println("vowel"+vowel);
	System.out.println("consonant"+consonant);
	System.out.println("symbol"+symbol);
	System.out.println("spaces"+space);

 }
}