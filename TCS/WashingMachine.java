
import java.util.*;
public class WashingMachine
 {
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
int total = in.nextInt();
if(total >= 0 && total <= 2000)
{
 System.out.println("25 min");
}
else if(total >= 2001 && total <= 4000)
{
 System.out.println("35 min");
}
else if(total >= 4001 && total <= 7000)
{
 System.out.println("45 min");
}
else if(total > 7000) 
{
System.out.println("Overload");
}
else
{
 System.out.println("Invalid input");
}
}
}

