import java.util.*;
public class MaxCount 
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter n:"); 
int n=in.nextInt();
int arr[]=new int[n];
System.out.println("Enter array:");
for(int i=0;i<arr.length;i++) 
{
arr[i]=in.nextInt();
}
int count=1;
int max=arr[0];
for(int i=1;i<n;i++)
{
if(arr[i]>max)
{
count++;
max=arr[i];
}
} 
System.out.println(count);
}
}
