import java.util.*;
public class RotateArrayClockwise 
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
System.out.println("Enter d:"); 
int d=in.nextInt();
d=d%n;
int start;
int end;
start=0;end=d-1;
while (start < end) 
{
int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;
start++;
end--;
}
start=d;end=n-1;
while (start < end) 
{
int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;
start++;
end--;
}
start=0;end=n-1;
while (start < end) 
{
int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;
start++;
end--;
}
for(int i=0;i<n;i++)
{
System.out.print(" "+arr[i]);
}
}
}




