import java.util.*;

class APGP {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
String s=in.nextLine();
String arr[]=s.split(",");
int n=arr.length-1;
int a=Integer.parseInt(arr[n]);
int b=Integer.parseInt(arr[n-1]);
int c=Integer.parseInt(arr[n-2]);
if(a-b==b-c)
{
int d=a-b;
System.out.println(d+a);
}
else
{
int d=a/b;
System.out.println(d*a);
}
}
}
