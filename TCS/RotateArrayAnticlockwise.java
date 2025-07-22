import java.util.*;
public class RotateArrayAntiClockwise 
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
System.out.println("Enter k:"); 
int k=in.nextInt();
k=k%n;
int start;
int end;
start=0;end=n-1;
while (start < end) 
{
int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;
start++;
end--;
}
start=0;end=k-1;
while (start < end) 
{
int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;
start++;
end--;
}
start=k;end=n-1;
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




