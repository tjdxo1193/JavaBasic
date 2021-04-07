package ProgrammersProblem;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s[] = new String[];
        int a[][] = new int[3][input];
        for(int i = 0; i < input; i++){
            s = sc.nextLine().split(" ");
            a[0][i] = Integer.parseInt(s[0]);
            a[1][i] = Integer.parseInt(s[1]);
            a[2][i] = Integer.parseInt(s[2]);
        }
        
    }
}