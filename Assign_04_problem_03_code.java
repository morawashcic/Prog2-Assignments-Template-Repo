//Mostafa ALi Aborawash
//20216464

import java.util.Scanner;

public class Main {
        static int Search(int[] arr, int sz, int target) {
            for (int i = 0; i < sz; i++)
            {
                if (arr[i] == target) return i;
            }
            return -1;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int sz = input.nextInt();
            int[] arr = new int[sz];
            for (int i = 0; i < sz; i++)
            {
                arr[i] = input.nextInt();
            }
            int target = input.nextInt();
            int res = Search(arr, sz, target);
            if (res == -1) System.out.println("-1");
            else System.out.println(res);
        }