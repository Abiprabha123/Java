import java.util.Scanner;

public class Monkey 
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
int n = in.nextInt();  
int b = in.nextInt();          
int p = in.nextInt();   
int nb= in.nextInt();  
int np= in.nextInt();      
if (n < 0 || b <= 0 || p <= 0 || nb < 0 || np < 0)
{
System.out.println("INVALID INPUT");
return;
}
int Down = 0;
for (int i = 0; i < n; i++) 
{
if (nb >= b)
{
nb -= b;
Down++;
}
else if (np >= p)
{
np -= p;
Down++;
} 
else if (nb > 0 || np > 0) 
{
nb = 0;
np = 0;
Down++;
break;
}
else 
{
break;
}
}
int monkeysLeft = n-Down;
System.out.println(monkeysLeft);
}
}
