import java.util.*;
class Perfect
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a number:");
int n=in.nextInt();
int temp=n;
int sum=0;
for(int i=1;i<n;i++)
{
if(n%i==0)
{
sum=sum+i;
}
}
if(sum==temp)
{
System.out.println("It is perfect no.");
}
else
{
System.out.println("It is not perfect no.");
}
}
}

