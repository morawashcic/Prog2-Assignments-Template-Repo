//Mostafa ALi Aborawash
//20216464

import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        int num1=0,num2=0;
        int num3=0,num4=0;
        boolean flag = false;
        System.out.println("enter the number please");
        num1= input.nextInt();
        for (int i = 2; i <= num1 / 2; ++i) {
            // condition for nonprime number
            if (num1 % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("prime");
        else
            System.out.println("not");
        
        
        System.out.println("enter the number please");
        num2= input.nextInt();
        for (int i = 2; i <= num2 / 2; ++i) {
            // condition for nonprime number
            if (num2 % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("prime");
        else
            System.out.println("not");

        System.out.println("enter the number please");
        num3= input.nextInt();
        for (int i = 2; i <= num3 / 2; ++i) {
            // condition for nonprime number
            if (num3 % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("prime");
        else
            System.out.println("not");

        System.out.println("enter the number please");
        num4= input.nextInt();
        for (int i = 2; i <= num4 / 2; ++i) {
            // condition for nonprime number
            if (num4 % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("prime");
        else
            System.out.println("not");
    }
}




