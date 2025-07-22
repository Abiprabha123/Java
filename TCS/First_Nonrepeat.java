import java.util.*;
class First_Nonrepeat
 {
public static void main(String[] args)
 {
Scanner in = new Scanner(System.in);
System.out.println("Enter the size of the matrix:");
int n = in.nextInt();
int arr[] = new int[n];
System.out.println("Enter the values of the matrix:");
for(int i=0;i<n;i++)
{
arr[i]=in.nextInt();
}
for(int i=0;i<n;i++)
{
int count=0;
for(int j=0;j<n;j++)
{
if(arr[i]==arr[j]&& i!=j)
{
count++;
}
}
if(count==0)
{
System.out.println(arr[i]);
return;
}
}
System.out.println("No non-repeating element found.");

}
}