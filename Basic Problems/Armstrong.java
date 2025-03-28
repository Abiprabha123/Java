import java.util.*;
class Armstrong
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a number:");
int n=in.nextInt();
int temp=n;
int count=0,sum=0;

while(temp>0)
{
temp=temp/10;
count++;
}
temp=n;
while(temp>0)
{
int power=1;
temp=temp%10;
for(int i=1;i<=count;i++)
{
power=power*temp;
}
sum=sum+power;
temp=temp/10;
}
if(n==sum)
{
System.out.println("Armstrong");
}
else
{
System.out.println(" Not Armstrong");
}

}
}

