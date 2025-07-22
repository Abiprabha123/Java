import java.util.*;
class FuelCTS 
{
public static void main(String[] args) 
{
Scanner in = new Scanner(System.in);
System.out.println("Enter the no of liters to fill the tank");
int liters = in.nextInt();
System.out.println("Enter the distance covered");
int distance = in.nextInt();
if (liters <= 0) 
{
System.out.println(liters + " is an Invalid Input");
return;
}
if (distance <= 0)
{
System.out.println(distance + " is an Invalid Input");
return;
}
float con = ((float) liters / distance) * 100;
double miles = distance * 0.6214;
double gallons = liters * 0.2642;
double mpg = miles / gallons;
System.out.printf("Liters/100KM\n%.2f\n", con);
System.out.printf("Miles/gallons\n%.2f\n", mpg);
}
}
