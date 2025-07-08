import java.util.*;
class HappyCoding
{
public static void main(String[] args) 
{
Scanner in = new Scanner(System.in);
int n=in.nextInt();
int m1=in.nextInt();
int m2=in.nextInt();
int c1=0,c2=0,c3=0;
for(int i=1;i<=n;i++)
{
if(i%m1==0&&i%m2==0)
{
System.out.print("HappyCoding");
c1++;
}
else if(i%m1==0)
{
System.out.print("Happy");
c2++;
}
else if(i%m2==0)
{
System.out.print("Coding");
c3++;
}
else
{
System.out.print(i);
}
}
System.out.print("Happy-"+c2);
System.out.print("Coding-"+c3);
System.out.print("HappyCoding-"+c1);
}
}

