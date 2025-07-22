import java.util.Scanner;

public class Encryption
{
public static void main(String[] args) 
{
Scanner in = new Scanner(System.in);
System.out.print("Enter a Text: ");
String text = in.nextLine();
System.out.print("Enter the Key: ");
int key = in.nextInt();
if (key < 0) 
{
System.out.println("INVALID INPUT");
}
else
{
StringBuilder enc = new StringBuilder();
int n =text.length();
for (int i = 0; i < n; i++) 
{
char ch = text.charAt(i);
if (Character.isLetter(ch)) 
{
char base = Character.isUpperCase(ch) ? 'A' : 'a';
enc.append((char) ((ch - base + key) % 26 + base));
} 
else if (Character.isDigit(ch)) 
{
enc.append((char) ((ch - '0' + key) % 10 + '0'));
} 
else
{
enc.append(ch);                 }
}
System.out.println("The encrypted Text is: " + enc);
}
}
}
