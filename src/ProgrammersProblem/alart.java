package ProgrammersProblem;

import java.util.Scanner;
import java.util.stream.Stream;

public class alart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] a = Stream.of(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        int h = a[0];
        int m = a[1];
        if (m-45 < 0){
            h = h-1;
            m = 60+m - 45;
            if(h < 0){
                h = 23;
            }
        }else {
            m = m-45;
        }
        String fmt = String.format("%d %d",h,m);
        System.out.println(fmt);
    }
}
