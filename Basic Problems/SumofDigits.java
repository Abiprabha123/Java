import java.util.*;
class SumofDigits
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
sum=sum+digit;
temp=temp/10;
}
System.out.println(sum);
}
}



