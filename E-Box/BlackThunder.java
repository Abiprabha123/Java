import java.util.*;
class BlackThunder {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
String s1=in.nextLine();
String s2=s1.toLowerCase();
char b='b';
char l='l';
char e='e';
char r='r';
char k='k';
int n=s2.length()-1;
if(s2.charAt(0)==b||s2.charAt(0)==l)
{
if(s2.charAt(n)==e||s2.charAt(n)==r)
{
for(int i=0;i<=n;i++)
{
if(s2.charAt(i)==k)
{
System.out.println("Valid input");
return;
}
}
System.out.println("Invalid input");
}
else
{
System.out.println("Invalid input");
}
}
else
{
System.out.println("Invalid input");
}
}
}