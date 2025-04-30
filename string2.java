import java.util.Arrays;
class Check
{
 public static void main(String args[])
 {
	String s1="att",s2="tta";
	char a[]=s1.toCharArray();
	char b[]=s2.toCharArray();
	Arrays.sort(a);
	Arrays.sort(b);
	System.out.println((Arrays.equals(a,b))?"anagram":"not  a anagram");
 }
}