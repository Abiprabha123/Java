import java.util.*;
class BitEquals
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n1=in.nextInt();
int n2=in.nextInt();
String b1="";
String b2="";
while(n1>0)
{
int rem=n1%2;
b1=rem+b1;
n1=n1/2;
}
while(n2>0)
{
int rem=n2%2;
b2=rem+b2;
n2=n2/2;
}
while(b1.length()<b2.length())
{
b1="0"+b1;
}
while(b2.length()<b1.length())
{
b2="0"+b2;
}
int count=0;
for(int i=0;i<b1.length();i++)
{
int d1=b1.charAt(i);
int d2=b2.charAt(i);
if(d1!=d2)
{
count++;
}
}
System.out.println(count);
}
}