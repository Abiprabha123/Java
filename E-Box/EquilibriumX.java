import java.util.*;
class EqulibriumX
{
public static void main(String[] args) 
{
Scanner in = new Scanner(System.in);
int n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=in.nextInt();
}
int total=1;
int product=1;
for(int i=0;i<n;i++)
{
total=total*arr[i];
}
for(int i=0;i<n;i++)
{
product=product*arr[i];
if(product==total/product)
{
System.out.println(i+1);
return;
}
}
}
}
