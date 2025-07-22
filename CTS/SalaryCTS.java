import java.util.*;
class SalaryCTS
{
public static void main(String[] args)
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the salary:");
int salary=in.nextInt();
System.out.println("Enter the performance appraisal rating:");
double rate=in.nextInt();
int total=0;
if(rate>=1&&rate<=3)
{
System.out.println(0.10*salary);
}
else if(rate>=3.1&&rate<=4)
{
System.out.println(0.25*salary);
}
else if(rate>=4.1&&rate<=5)
{
System.out.println(0.30*salary);
}
else
{
System.out.println("Invalid output");
}
}
}

