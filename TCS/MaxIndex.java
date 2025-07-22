import java.util.Scanner;

class MaxIndex {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
System.out.println("Enter the size of the matrix:");
int n = in.nextInt();
int arr[][] = new int[n][n];
System.out.println("Enter the matrix elements:");
for (int i = 0; i < n; i++) {  
for (int j = 0; j < n; j++) {  
arr[i][j] = in.nextInt();
}
}
int max = 0;       
int index = -1; 
for (int i = 0; i < n; i++)
{
int sum = 0;
for (int j = 0; j < n; j++) 
{  
sum += arr[i][j];
}
if (sum > max)
{
max = sum;
index = i;
}
}
if (index != -1)
{
   System.out.println("Row with max sum is: " + index);
} 
else 
{
  System.out.println("No valid row found.");
}
}
}



