import java.util.*;
public class IsSubset{
public static void main(String[] args) 
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a&b:"); 
int a=in.nextInt();
int b=in.nextInt();
int arr1[]=new int[a];
int arr2[]=new int[b];
System.out.println("Enter arr1:"); 
for(int i=0;i<arr1.length;i++) 
{
arr1[i]=in.nextInt();
}
System.out.println("Enter arr2:"); 
for(int i=0;i<arr2.length;i++) 
{
arr2[i]=in.nextInt();
}
int count=0;
for(int i=0;i<arr2.length;i++)
{
for(int j=0;j<arr1.length;j++)
{
if(arr2[i]==arr1[j])
{
count++;
}
}
}
if(count==b)
{
System.out.println("Is a Subset"); 
}
else
{
System.out.println("Is Not a Subset"); 
}
}
}




