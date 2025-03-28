import java.util.*;
class HarshadNo
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a number:");
int n=in.nextInt();
int temp=n;
int sum=0;
while(n>0)
{
int digit=n%10;
sum=sum+digit;
n=n/10;
}
if(temp%sum==0)
{
System.out.println("It is Harshad No.");
}
else
{
System.out.println("It is not Harshad No.");
}
}
}



