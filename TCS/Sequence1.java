import java.util.*;
class Sequence1
{
public static void main(String[] args) 
{
Scanner in = new Scanner(System.in);
System.out.println("Enter the no:");
int n= in.nextInt();
int j=0;
int k=0;
int l=0;
int m=0;

for(int i=1;i<=n;i++)
{
if(i%2!=0)
{
l=j*7;
System.out.println(l);
j++;
}
else
{

m=k*6;
System.out.println(m);
k++;
}
if(i==15)
{
System.out.println("15th term:"+l);
return;
}
}
}
}