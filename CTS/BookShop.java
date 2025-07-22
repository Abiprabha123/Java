import java.util.*;
class BookShop
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int m=in.nextInt();
int sno[]=new int[n];
int value[]=new int[n];
int price[]=new int[n];
int mark[]=new int[n];
for(int i=0;i<n;i++)
{
sno[i]=in.nextInt();
value[i]=in.nextInt();
price[i]=in.nextInt();
mark[i]=in.nextInt();
}
for(int i=0;i<n;i++)
{
System.out.print(sno[i]);
System.out.print(value[i]);
System.out.print(price[i]);
System.out.print(mark[i]);
System.out.println();
}
}
}



