package lab;

import java.util.Scanner;

//27. 다음 조건을 이용해서 현재 연도를 입력하면 윤년 여부를
//        출력하는 프로그램을 작성하세요. (LeapYear)
//
//        가. 현재 연도가 4로 나눠 떨어지지만, 100으로는 나눠 떨어지지 않음
//
//        나. 현재 연도가 400으로 나눠 떨어짐

public class Q27_LeapYear {
    public static void main(String[] args) {
        int year = 0;
        boolean LeapY= true;
        Scanner sc = new Scanner(System.in);
        System.out.print("현재 년도를 입력하세요 : ");
        year = sc.nextInt();

        LeapY = ((year%4 == 0)&&(year % 100 != 0)) ? true :
                (year%400 == 0) ? true : false;


        if(LeapY)
            System.out.println("윤년 입니다");
        else
            System.out.println("윤년 아닙니다.");
    }
}
