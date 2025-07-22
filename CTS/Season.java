import java.util.Scanner;

public class Season 
{
public static void main(String[] args) 
{
Scanner in= new Scanner(System.in);
System.out.println("Enter the month: ");
int m = in.nextInt();

if(m<1||m>12)
{
System.out.println("Invalid month: ");
}
else if(m>=3&&m<=5)
{
System.out.println("Season:Spring ");
}
else if(m>=6&&m<=8)
{
System.out.println("Season :Summer");
}
else if(m>=9&&m<=11)
{
System.out.println("Season :Autumn");
}
else 
{
System.out.println("Season:Winter ");
}
}
}




