package seoungcoding;

import java.util.Scanner;

/**
 * 파일명: SungJukV1
 * 작성일 : 2020.11.17
 *
 * 프로그램 설명: 성적처리 프로그램 v3
 * 학생 3명의 성적 데이터를 키보드로 입력 받아서
 * 총점, 평균, 학점을 계산하고 결과출력
 *
 * 단, 평균은 소수점 첫째 자리까지 출력하고
 *  name, kor, eng, mat, sum, mean, grd
 * 학점 기준은 수우미양가로 하되
 * switch문으로 학점을 계산하도록 함
 *
 * 만점은 100점
 * 100~90, 89~80, 79~70, 69~60, 59~0 기준으로 학점 부여
 * 삼항 연산자
 *
 * 단 , 성적처리 결과 출력시 출력문을 하나만
 * 사용하기로 함
 * 그리고 Math.round() 이용해서
 * 평균은 소수점 둘째 자리 까지 끊어서 출력함
 *
 */
public class SungJukV3 {
    public static void main(String[] args) {

        Sung_JukV3();




    }
    public static void Sung_JukV3(){

        //변수선언
        String name;
        int kor,eng,mat;
        int sum = 0;
        double mean = 0.0;
        char grd = '가';
        String fmt = "-----------\n이름 : %s\n국어 : %d\n수학 : %d\n영어 : %d\n-----------\n총점 : %d\n평균 : %.2f\n학점 : %c\n-----------\n";
        String result;
        for(int i = 1; i <=3; i++) {
            //처리
            Scanner sc = new Scanner(System.in);
            System.out.println(i + "번째 학생 성적 입력중....");
            System.out.print("이름 입력하시오 :");
            name = sc.next();
            System.out.print("국어점수를 입력하시오 :");
            kor = sc.nextInt();
            System.out.print("영어점수를 입력하시오 :");
            eng = sc.nextInt();
            System.out.print("수학점수를 입력하시오 :");
            mat = sc.nextInt();

            //
            sum = kor + eng + mat;
            mean = sum / 3.0;
            switch ((int) (mean / 10)) {
                case 10:
                case 9:
                    grd = '수';
                    break;
                case 8:
                    grd = '우';
                    break;
                case 7:
                    grd = '미';
                    break;
                case 6:
                    grd = '양';
                    break;
                default:
                    grd = '가';
            }
            ;
            //결과출력

            System.out.printf(fmt, name, kor, eng, mat, sum, mean, grd);
        }
    }
}