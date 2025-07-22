import java.util.*;
class PrimeTCS
{
public static void main(String[] args) 
{
Scanner in = new Scanner(System.in);
System.out.println("Enter the no:");
int n= in.nextInt();
check(n);
}
static void check(int n)
{
if(n<=0)
{
System.out.println("Enter postive no.");
}
else
{
prime(n);
}
}
static void prime(int n)
{
if(n==1)
{
System.out.println("is not prime");
}
else
{
int count=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==2)
{
System.out.println("Is Prime");
}
else
{
System.out.println("is not prime");
}
}
}
}
	
