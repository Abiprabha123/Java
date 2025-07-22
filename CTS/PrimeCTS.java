import java.util.Scanner;

public class PrimeCTS
{
public static void main(String[] args) 
{
Scanner in = new Scanner(System.in);
System.out.print("Enter the first number: ");
int start = in.nextInt();
System.out.print("Enter the second number: ");
int end = in.nextInt();
if (start <= 0 || end <= 0 || start >= end) 
{
System.out.println("Provide valid input");
return;
}
for (int num = start; num <= end; num++)
{
int count=0;
for(int i=1;i<=num;i++)
{
if(num%i==0)
{
count++;
}
}
if(count==2)
{
System.out.println(num);
}
}	
}
}
