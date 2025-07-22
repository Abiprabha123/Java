import java.util.*;
public class WallPainting {
public static void main(String[] args){
Scanner in = new Scanner(System.in);
int Int = in.nextInt();
int Ext = in.nextInt();
double total = 0;
for(int i=0;i<Int;i++)
{
 total += in.nextDouble() * 18;
}
for(int i=0;i<Ext;i++)
{
 total += in.nextDouble() * 12;
}
System.out.println(total);
}
}
