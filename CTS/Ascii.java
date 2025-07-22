import java.util.Scanner;

public class Ascii
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
int[] ascii = new int[4];
System.out.println("Enter 4 ASCII codes:");
for (int i = 0; i < 4; i++)
{
asciiCodes[i] = in.nextInt();
}
System.out.println("Corresponding Characters:");
for (int i = 0; i < 4; i++)
{
char character = (char) ascii[i]; // Casting ASCII code to character
System.out.println(asciiCodes[i] + "-" + character);
}
}
}
