

import java.util.*;
public class TraineeSelection
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
int total = in.nextInt();
int[] arr = new int[total];
for(int i=0;i<total;i++)
{
 arr[i] = in.nextInt();
}
int sum = 0;
for(int i=0;i<total;i++) 
{
sum += arr[i];
}
int avg = sum/arr.length;
for(int i=0;i<total;i++)
{
 if(arr[i] > avg)
{
 System.out.println("trainee number "+ (i+1));
}
}
}
}
