import java.util.*;
class OddEven_Binary
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a number:");
int n=in.nextInt();
int a=in.nextInt();
int b=a;
if((n&1)==1)
{
System.out.println("It is odd");
}
else
{
System.out.println("It is even");
}
a=a>>1;
a=a<<1;
if(a==b)
{
System.out.println("It is even");
}
else
{
System.out.println("It is odd");
}

}
}

