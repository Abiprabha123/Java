import java.util.*;
public class Symmentric{
public static void main(String[] args) 
{
Scanner in=new Scanner(System.in);
System.out.println("Enter a:"); 
int a=in.nextInt();
int b=in.nextInt();
int arr[][]=new int[a][b];
for(int i=0;i<a;i++) 
{
for(int j=0;j<b;j++)
{
System.out.println("Enter arr:"+i+","+j); 
arr[i][j]=in.nextInt();
}
}
for(int i=0;i<a;i++) 
{
for(int j=i+1;j<a;j++)
{
if(arr[i][0]==arr[j][1]&&arr[i][1]==arr[j][0])
{
System.out.println("("+arr[i][0]+","+arr[i][1]+")");
}
}
}
}
}
