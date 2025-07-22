import java.util.*;
class CourseCTS
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the no of course :");
int n=in.nextInt();
in.nextLine();
if(n<=0||n>20)
{
System.out.println("Invalid output");
}
String course[]=new String[n];
for(int i=0;i<n;i++)
{
course[i]=in.nextLine();
}
System.out.println("Enter the course :");
String search=in.nextLine();
for(int i=0;i<n;i++)
{
if(course[i].equals(search))
{
System.out.println(search+" course is available");
return;
}
}
System.out.println(search+" course is not available");
}
}


