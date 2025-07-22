import java.util.Scanner;

public class Theatre 
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
int pizza = in.nextInt();  
int puffs = in.nextInt();          
int drinks = in.nextInt();
int pizzarate=100;
int puffsrate=20;
int drinksrate=10;
int total=(pizza*pizzarate)+( puffs*puffsrate)+(drinks*drinksrate);
Sstem.out.println(total);
}
}  