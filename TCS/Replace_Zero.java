import java.util.Scanner;

class Replace_zero 
{
public static void main(String[] args) 
{
Scanner in = new Scanner(System.in);
System.out.println("Enter the size of the array:");
int n = in.nextInt();
int arr[] = new int[n];
System.out.println("Enter the values of the array:");
for (int i = 0; i < n; i++) 
{
 arr[i] = in.nextInt();
}
 int j = 0; 
 for (int i = 0; i < n; i++)
 {
 if (arr[i] != 0) 
{                
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
j++;            
}
 }
System.out.println("Modified array:");
for (int i = 0; i < n; i++) 
{
System.out.print(arr[i] + " ");
}
}
}
