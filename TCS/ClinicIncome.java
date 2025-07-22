import java.util.*;
public class ClinicIncome
 {
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
int n=in.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
{
arr[i]=in.nextInt();
}
int sum=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]<17)
{
sum=sum+200;
}
else if(arr[i]>=17&&arr[i]<40)
{
sum=sum+400;
}
else if(arr[i]>40)
{
sum=sum+300;
}
else
{
System.out.println("Invalid Output");
}
}
System.out.println("Total Income:"+sum);
}
}
