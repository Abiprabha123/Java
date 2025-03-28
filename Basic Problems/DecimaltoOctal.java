import java.util.*;
class DecimaltoOctal
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a number:");
int n=in.nextInt();
int a=n;
String o="";
while(n>0)
{
int rem=n%8;
o=rem+o;
n=n/8;
}
System.out.println(o);
}
}
