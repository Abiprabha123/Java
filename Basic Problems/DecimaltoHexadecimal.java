import java.util.*;
class DecimaltoHexadecimal
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a number:");
int n=in.nextInt();
int a=n;
String h="";
while(n>0)
{
int rem=n%16;
if(rem<10)
{
h=rem+h;
}
else
{
h=(char)('A'+(rem-10))+h;
}
n=n/16;
}
System.out.println(h);
}
}
