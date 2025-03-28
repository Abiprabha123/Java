import java.util.*;
class DecimaltoBinary
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a number:");
int n=in.nextInt();
int a=n;
String b="";
while(n>0)
{
int rem=n%2;
b=rem+b;
n=n/2;
}
System.out.println(b);
}
}
