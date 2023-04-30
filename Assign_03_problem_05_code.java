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

            for (int j = Math.min(x, y) + 1; j < Math.max(x, y); j++) {
                if (j % 2 == 1) {
                    sum += j;
                }
            }

            System.out.println(sum);
        }


    }
}

