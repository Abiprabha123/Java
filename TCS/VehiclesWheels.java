import java.util.*;
class VehicleWheels{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
System.out.println("Enter a number:");
int w = in.nextInt();
int v = in.nextInt();
if(w%2!=0|| w<v*2||w>v*4)
{
System.out.println("-1,-1");
}
else
{
for(int i=1;i<v;i++)
{
int y = (w - 2 * v) / 2;
int x = v - y;
System.out.println(x + " " + y);
}
}
}
}

