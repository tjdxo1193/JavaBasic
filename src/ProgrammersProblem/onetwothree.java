package ProgrammersProblem;

import java.util.Scanner;

public class onetwothree {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            int[] num = new int[input];
            for (int i = 0; i < input; i++){
                num[i] = sc.nextInt();
            }
            for (int i = 0; i < input; i++){
                System.out.println(fadd(num[i]));
            }

        }
        public static int fadd(int n){
            if (n==0){
                return 0;
            }else if (n==1){
                return 1;
            }else if (n==2){
                return 2;
            }else if (n==3){
                return 4;
            }
            return fadd(n-1)+fadd(n-2)+fadd(n-3);
        }
}
