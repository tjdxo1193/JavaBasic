package seoungcoding.sungjuk;

import java.util.Scanner;

/**
 * 파일명: SungJukV2
 * 작성일 : 2020.11.17
 *
 * 프로그램 설명: 성적처리 프로그램 v2
 * 이름, 국어, 영어, 수학 점수를 키보드로 입력 받아
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
public class SungJukV2d {
    public static void main(String[] args) {

        Sung_JukV1();

    }
    public static void Sung_JukV1(){

        //변수선언
        String name;
        int kor,eng,mat;
        int sum = 0;
        double mean = 0.0;
        char grd = '가';
        String fmt = "이름 : %s\n국어 : %d\n수학 : %d\n영어 : %d\n총점 : %d\n평균 : %s\n학점 : %c";
        String result;
        //입력
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력하시오 :" );
        name = sc.nextLine();
        System.out.print("국어점수를 입력하시오 :" );
        kor = sc.nextInt();
        System.out.print("영어점수를 입력하시오 :" );
        eng = sc.nextInt();
        System.out.print("수학점수를 입력하시오 :" );
        mat = sc.nextInt();

        //처리
        sum = kor + eng + mat;
        mean = sum / 3.0;
        switch((int)(mean/10)) {
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
                //String.format(형식지정자, 변수들)
            }
            mean = Math.round(mean * 100) / 100.0;
            result = String.format(fmt, name, kor, eng, mat, sum, String.valueOf(mean), grd);
            //String.valueOf(값)
            //숫자를 문자로 변환


//            String arr[][] = {{"이름",name},{"국어",Integer.toString(kor)},{"영어",Integer.toString(eng)},{"수학",Integer.toString(mat)},{"총점",Integer.toString(sum)},
//                    {"평균",Double.toString(mean)},{"학점",Integer.toString(grd)}};
//
//            //결과출력
//            for(int i = 0; i <6; i++ ) {
//                System.out.println(arr[i][0]+ " : " +arr[i][1]);
//        }

//              System.out.println("이름 : " + name +
//                      "\n국어 : " + kor +
//                      "\n영어 : " + eng +
//                      "\n수학 : " + mat +
//                      "\n----------" +
//                      "\n총점 : " + sum +
//                      "\n평균 : " + mean +
//                      "\n학점 : " + grd +
//                      "\n----------");
        //문자열 연결 연산자로(+) 문장을 만드는 경우
        //String 변수의_특성때문에 성능저하 발생
        System.out.println(result);

    }
}