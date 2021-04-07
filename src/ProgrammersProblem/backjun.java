package ProgrammersProblem;

//첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
//첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] NX = new String[2];
        NX = sc.nextLine().split(" ");

        String[] input = new String[Integer.parseInt(NX[0])];
        input = sc.nextLine().split(" ");

        for (int i = 0; i < input.length; i++){
            if (Integer.parseInt(NX[1]) > Integer.parseInt(input[i])){
                System.out.print( input[i] + " ");
            }
        }
    }
}