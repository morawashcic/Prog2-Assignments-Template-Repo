//Mostafa ALi Aborawash
//20216464

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int fib1 = 0, fib2 = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(fib1 +" ");


            int fib_n= fib1 + fib2;
            fib1 = fib2;
            fib2 = fib_n;
        }
    }
}