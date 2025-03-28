import java.util.*;
class LCM
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a number:");
int a=in.nextInt();
int b=in.nextInt();
int c=a*b;
int temp=0;
while(b!=0)
{
temp=b;
b=a%b;
a=temp;
}
System.out.println(c/a);


}
}