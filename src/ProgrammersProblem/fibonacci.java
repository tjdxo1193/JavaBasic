package ProgrammersProblem;

import java.util.Scanner;

public class fibonacci {
    static int one_count = 0;
    static int zero_count = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] num = new int[input];
        for (int i = 0; i < input; i++){
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < input; i++){
            fibo(num[i]);
            System.out.println(one_count+ " " +zero_count);
            one_count = 0;
            zero_count = 0;
        }


    }
    public static int fibo(int n) {
        if (n == 0) {
            one_count++;
            return 0;
        } else if (n == 1) {
            zero_count++;
            return 1;
        } else {
            return fibo(n-1) + fibo(n-2);
        }
    }
}
