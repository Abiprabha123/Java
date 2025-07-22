
import java.util.*;
class CandyShop {
public static void main(String[] args){
Scanner in = new Scanner(System.in);
int total = 10;
int min = 5;
System.out.println("No. of candy:");
int sold = in.nextInt();
if(total<sold)
{
System.out.println("Invalid Input");
}
else if(total-sold >= min)
{
System.out.println("sold "+sold);
System.out.println("left "+(total-sold));
}
else
{
System.out.println("sold "+sold);
total=10;
System.out.println("left "+total);
}
}
}