import java.util.*;
public class Repeat 
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
String s="*##*#*";
int n=s.length();
int count1=0;
for(int i=0;i<n;i++)
{
if(s.charAt(i)=='*')
{
count1++;
}
}
int count2=0;
for(int i=0;i<n;i++)
{
if(s.charAt(i)=='#')
{
count2++;
}
}
if(count1==count2)
{
System.out.println("0");
}
else if(count1<count2)
{
System.out.println("Negative");
}
else
{
System.out.println("Postive");
}
}
}




