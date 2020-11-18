package lab;

import java.util.Scanner;

//28. 사용자로부터 숫자(1 - 9)를 하나 입력 받아, 구구단을 출력하는 프로그램을
//        작성해보세요. 단, 1 - 9 이외의 숫자나 문자를 입력 받으면 “잘못 입력하셨습니다!!”라는 메시지를 출력하도록 합니다. (GuGuDan)
public class Q28_Gugudan {

    public static void main(String[] args) {
        int key;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("숫자를 입력하세요(1~9단) : ");
            key = sc.nextInt();
            if ((key >= 1) && (key <= 9)) {
                for (int i = 1; i < 10; i++) {
                    System.out.println(key + " X " + i + " = " + key * i);
                }
                break;
            } else
                System.out.println("잘못 입력하셨습니다!!");
        }

    }
}
