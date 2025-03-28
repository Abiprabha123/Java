import java.util.*;
class NoofDigits
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a number:");
int n=in.nextInt();
int temp=n;
int count=0;
while(temp>0)
{
temp=temp/10;
count++;
}
System.out.println(count);
}
}

