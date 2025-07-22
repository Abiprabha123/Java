import java.util.*;

class Duplicate
 {
 public static void main(String[] args) 
{
 String s1 = "ababcabc";
 String s2 = "";
 String s3="abbacc";
 for (int i = 0; i < s1.length(); i++)
 {
 char ch = s1.charAt(i);
  if (s2.indexOf(ch) == -1) 
{                
 s2 += ch;
    }
   }

  System.out.println("Unique Characters: " + s2);

  int sum = 0;
   for (int i = 0; i < s2.length(); i++)
 {
  int count = 0;
   for (int j = 0; j < s1.length(); j++)
 { 
   if (s2.charAt(i) == s1.charAt(j)) 
{
    count++;
                }
            }
            sum += count;
            System.out.println(s2.charAt(i) + " appears " + count + " times");
        }

        System.out.println("Total count of all characters: " + sum);
    }
}
