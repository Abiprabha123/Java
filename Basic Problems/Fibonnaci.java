import java.util.*;
class Fibonnaci
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a number:");
int n=in.nextInt();
int F1=0;
int F2=1;
int F3;
System.out.println(F1);
System.out.println(F2);
for(int i=1;i<=n;i++)
{
F3=F2+F1;
F1=F2;
F2=F3;
System.out.println(F3);
}
}
}

