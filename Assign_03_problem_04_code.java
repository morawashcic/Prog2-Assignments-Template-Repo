//Mostafa ALi Aborawash
//20216464

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            int sum = 0;
            int count = 0;
            while (count < y) {
                if (x % 2 == 1) {
                    sum += x;
                    count++;
                }
                x++;
            }
            System.out.println(sum);
        }
    }
}