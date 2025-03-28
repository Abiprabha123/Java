import java.util.*;
class NeonNo
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a number:");
int n=in.nextInt();
int temp=n;
int s=n*n;
int sum=0;
while(s>0)
{
int digit=s%10;
sum=sum+digit;
s=s/10;
}
if(n==sum)
{
System.out.println("It is Neon No.");
}
else
{
System.out.println("It is not Neon No.");
}
}
}


