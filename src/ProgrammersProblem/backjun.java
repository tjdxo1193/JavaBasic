package ProgrammersProblem;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input_first = sc.nextInt();
        int input_second = sc.nextInt();

        int num_three = input_first * (input_second%10);
        int num_four = input_first * ((input_second-input_second%10)%100/10);
        int num_five = input_first * ((input_second/100));

        int num_six = num_five*100+(num_four*10)+num_three;

        String fmt = String.format("%d\n%d\n%d\n%d",num_three,num_four,num_five,num_six);
        System.out.println(fmt);
    }

}
