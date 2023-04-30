//Mostafa ALi Aborawash
//20216464

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(++count + " ");
            System.out.print(++count + " ");
            System.out.print(++count + " ");
            System.out.print("PUM");
            System.out.println();
            ++count;
        }

    }
}