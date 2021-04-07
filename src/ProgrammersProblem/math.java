package ProgrammersProblem;

import java.util.Scanner;
import java.util.stream.Stream;

public class math {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean re = true;
        int stack = 0;
        int[] s = new int[100];
        while(re){
            String input = sc.nextLine();
            int[] a = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            s[stack] = a[0] + a[1];
            if (a[0] == 0 && a[1] == 0){
                re = false;
            }
            stack++;
        }
        for (int t = 0; t < 100; t++){
            if (s[t] == 0){
                break;
            }
            System.out.println(s[t]);
        }
    }
}
