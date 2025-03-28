import java.util.*;
class Palindrome
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a number:");
int n=in.nextInt();
int temp=n;
int result=0;
int rev;
while(temp>0)
{
rev=temp%10;
result=result*10+rev;
temp=temp/10;
}
if(result==n)
{
System.out.println("it is palindrome");
}
else
{
System.out.println("it is not a palindrome");

}

}
}
