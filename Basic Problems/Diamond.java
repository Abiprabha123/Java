import java.util.*;
class Diamond

{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a number:");
int n=in.nextInt();
for(int i=0;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=(2*i)-1;k++)
{
System.out.print("*");
}

System.out.println();

}
for(int i=n-1;i>=1;i--)
{
for(int j=1;j<=n-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=(2*i)-1;k++)
{
System.out.print("*");
}

System.out.println();

}
}
}


