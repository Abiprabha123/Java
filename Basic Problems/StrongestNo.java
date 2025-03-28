import java.util.*;
class StrongestNo
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a number:");
int n=in.nextInt();
int temp=n;
int sum=0;
while(temp>0)
{
int digit=temp%10;
int fact=1;
for(int i=1;i<=digit;i++)
{
fact=fact*i;
}
sum=sum+fact;
temp=temp/10;
}
if(sum==n)
{
System.out.println("It is strongest no.");
}
else
{
System.out.println("It is not strongest no.");
}

}
}

