import java.util.Scanner;

class Pascal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();
        in.close();

        for (int i = 0; i <= n; i++) {
                        for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            int num = 1;  
            for (int k = 0; k <= i; k++) {
                System.out.print(num + " ");
                num = num * (i - k) / (k + 1);  
            }

            System.out.println();
        }
    }
}
