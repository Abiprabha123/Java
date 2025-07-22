import java.util.*;
public class Equilibrium 
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter n:"); 
int n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++) 
{
arr[i]=in.nextInt();
}
for(int i = 0; i < n; i++) 
{
int ls=0;
int rs=0;
for(int j = 0; j < i; j++) 
{
 ls=ls+arr[j];
}
for(int k=i+1;k<n;k++)
{
rs=rs+arr[k];
}
if(ls==rs) 
{
System.out.println("Index:"+i);
return;
}
}
System.out.println("No Equilibrium"); 
}
}
