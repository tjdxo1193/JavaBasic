package lab;

import java.util.Scanner;

//        26. 사용자가 연봉과 결혼 여부를 입력하면 다음의 세금율에 의해 납부해야
//        할 세금을 계산하는 프로그램을 작성하세요 (Tax)
//
//        가. 미혼인 경우 : 연봉 3000미만 - 10%,  연봉 3000이상 - 25%
//
//        나. 결혼한 경우 : 연봉 6000미만 - 15%,  연봉 6000이상 - 35%
public class Q26_Salary {
    public static void main(String[] args) {


        Tax();
    }
    public static void Tax(){
        int salary = 0;
        int tax = 0;
        boolean marry = true;
        Scanner sc = new Scanner(System.in);

        System.out.print("연봉을 입력하세요(단위: 만) : ");
        salary = sc.nextInt();
        System.out.print("결혼 여부(했으면 true, 아니면 false) : ");
        marry = sc.nextBoolean();

        if(marry){
            if (salary < 6000 ) {
                tax = salary*15/100;
            }else
                tax = salary*35/100;

        }else{
            if (salary < 3000){
                tax = salary*10/100;
            }else
                tax = salary*25/100;
        }

        System.out.println("내실 세금: " + tax);

    }



}
