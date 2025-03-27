import java.util.*;

class Swapping_Binary
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a number:");
int a=in.nextInt();
int b=in.nextInt();
a=a^b;
b=a^b;
a=a^b;

System.out.println(a);
System.out.println(b);
}
}


