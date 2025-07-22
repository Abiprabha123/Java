import java.util.*;

public class keylocker {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        List<String> results = new ArrayList<>();
        
        decode(input, 0, "", results);
        
        Collections.sort(results);
        
        for (String password : results) {
            System.out.println(password);
        }
    }


    public static void decode(String input, int index, String current, List<String> results) {
  
        if (index == input.length()) {
            results.add(current);
            return;
        }

        int oneDigit = input.charAt(index) - '0';
        if (oneDigit >= 1 && oneDigit <= 9) {
            decode(input, index + 1, current + (char)('a' + oneDigit - 1), results);
        }

        if (index + 1 < input.length()) {
            int twoDigit = Integer.parseInt(input.substring(index, index + 2));
            if (twoDigit >= 10 && twoDigit <= 26) {
                decode(input, index + 2, current + (char)('a' + twoDigit - 1), results);
            }
        }
    }
}