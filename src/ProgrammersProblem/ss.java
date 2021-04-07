package ProgrammersProblem;

import java.util.Scanner;

public class ss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(
                (input >= 90) ? "A" : (input >= 80) ? "B" : (input >= 70) ? "C" :
                        (input >= 60) ? "D" : "F"
        );
    }
}