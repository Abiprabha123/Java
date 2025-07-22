import java.util.Scanner;

public class Placement 
{
public static void main(String[] args) 
{
Scanner in= new Scanner(System.in);
System.out.print("Enter the number of students placed in CSE: ");
int cse = in.nextInt();
System.out.print("Enter the number of students placed in ECE: ");
int ece = in.nextInt();
System.out.print("Enter the number of students placed in MECH: ");
int mech = in.nextInt();
if (cse < 0 || ece < 0 || mech < 0) 
{
 System.out.println("Input is Invalid");
} 
else if (cse == ece && ece == mech)
{
System.out.println("None of the department has got the highest placement");
}

else if(cse==ece&&cse>mech)
{
    System.out.println("Highest placement:CSE and ECE");
}
else if(cse<ece&&ece==mech)
{
    System.out.println("Highest placement:ECE and MECH");
}
else if(cse==mech&&cse>ece)
{
    System.out.println("Highest placement:CSE and MECH");
}
else if(cse>ece&&cse>mech)
{
    System.out.println("Highest placement:CSE");
}
else if(cse<ece&&ece>mech)
{
    System.out.println("Highest placement:ECE");
}
else
{
 System.out.println("Highest placement:MECH");
}


}

}
