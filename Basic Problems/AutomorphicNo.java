import java.util.*;
class AutomorphicNo
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a number:");
int n=in.nextInt();
int s=n*n;
while(n>0)
{
if(n%10!=s%10)
{
System.out.println("It is not Automorphic No.");
return;
}
n=n/10;
s=s/10;
}
System.out.println("It is Automorphic No.");
}
}