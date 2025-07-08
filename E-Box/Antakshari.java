import java.util.*;

class Antakshari {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int n=in.nextInt();
in.nextLine();
String[] words = new String[n];
System.out.println("Enter words:");
for (int i = 0; i < n; i++) 
{
words[i] = in.nextLine().trim().toLowerCase();          
}
for (int i = 0; i < n-1; i++) 
{
char last = words[i].charAt(words[i].length() - 1);
char first= words[i + 1].charAt(0);
if (last == first) 
{
System.out.println(words[i]);
}
else 
{
return;
}
}
}
}
