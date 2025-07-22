import java.util.*;
class FactorialwithAddition
 {
    public static void main(String[] args)
      {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++)
        {
            int temp = 0;
            for (int j = 0; j < i; j++) 
        {        
         temp += fact;
            }
            fact= temp;
        }

        System.out.println(fact);
    }
}



