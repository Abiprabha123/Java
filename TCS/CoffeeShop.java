import java.util.Scanner;

public class CoffeeShop 
{
public static void main(String[] args) 
{
Scanner in = new Scanner(System.in);
System.out.println("Enter category (c: Coffee, t: Tea, s: Soup, d: Drink): ");
char a = in.next().charAt(0);
System.out.println("Enter item number: ");
int b = in.nextInt();
System.out.println("Welcome to CCD!");
if (a == 'c')
 {
 switch (b) 
{
case 1:
System.out.println("Enjoy your Espresso Coffee!");
break;
case 2:
System.out.println("Enjoy your Cappuccino Coffee!");
break;
case 3:
System.out.println("Enjoy your Latte Coffee!");
break;
default:
System.out.println("Invalid Input");
break;
}
} 
else if (a == 't') 
{
switch (b)
 {
  case 1:
  System.out.println("Enjoy your Plain Tea!");
  break;
  case 2:
  System.out.println("Enjoy your Assam Tea!");
  break;
  case 3:  
  System.out.println("Enjoy your Ginger Tea!");
  break;
  case 4:
  System.out.println("Enjoy your Cardamom Tea!");
  break;
  case 5:
  System.out.println("Enjoy your Masala Tea!");
  break;
  case 6:
  System.out.println("Enjoy your Lemon Tea!");
  break;
  case 7:
  System.out.println("Enjoy your Green Tea!");
  break;
  case 8:
  System.out.println("Enjoy your Organic Darjeeling!");
  break;
  default:
  System.out.println("Invalid Input");
  break;
}
  }
 else if (a == 's') 
{
 switch (b) 
{
 case 1:
 System.out.println("Enjoy your Hot and Sour Soup!");
 break;
 case 2:
 System.out.println("Enjoy your Veg Corn Soup!");
 break;
 case 3:
 System.out.println("Enjoy your Tomato Soup!");
 break;
 case 4:
 System.out.println("Enjoy your Spicy Tomato Soup!");
 break;
 default: 
 System.out.println("Invalid Input");
 break;
}
 } 
else if (a == 'd') 
{
 switch (b)
 {
case 1:
System.out.println("Enjoy your Hot Chocolate Drink!");
break;
case 2: 
System.out.println("Enjoy your Badam Drink!");
break;
case 3:
System.out.println("Enjoy your Badam-Pista Drink!");
break;
default:
System.out.println("Invalid Input");
break;
 }
 } 
else 
{
System.out.println("Invalid Input");
}
}
}
