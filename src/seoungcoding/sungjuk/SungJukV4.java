package seoungcoding.sungjuk;
import java.util.Scanner;

/**
 * 파일명: SungJukV4
 * 작성일 : 2020.11.18
 *
 * 프로그램 설명: 성적처리 프로그램 v4
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
 *
 * 코드의 가독성과 유지보수를 용이하게 하기 위해
 * 메서드 기반 코드로 재작성
 *
 */
public class SungJukV4 {
    public static void main(String[] args) {
        String name[] = new String[3];
        int kor[] = new int[3];
        int eng[] = new int[3];
        int mat[] = new int[3];
        int sum[] = new int[3];
        double mean[] = new double[3];
        char grd[] = new char[3];
        String result;

        readSungJuk(name, kor, eng, mat);
        computeSungJuk(kor, eng, mat, sum, mean, grd);
        printSungJuk(name, kor, eng, mat, sum, mat, grd);
    }

    //성적 데이터 입력받기 : readSungJuk
    public static void readSungJuk(String[] name, int[] kor, int[] eng, int[] mat) {
        for (int i = 1; i <= 3; i++) {
            //처리
            Scanner sc = new Scanner(System.in);
            System.out.println(i + "번째 학생 성적 입력중....");
            System.out.print("이름 입력하시오 :");
            name[i - 1] = sc.nextLine();
            System.out.print("국어점수를 입력하시오 :");
            kor[i - 1] = sc.nextInt();
            System.out.print("영어점수를 입력하시오 :");
            eng[i - 1] = sc.nextInt();
            System.out.print("수학점수를 입력하시오 :");
            mat[i - 1] = sc.nextInt();
            sc.skip("\r\n|[\n\r]");
        }
    }

    //성적데이터 총점, 평균, 학점 처리 : computeSungJuk
    public static void computeSungJuk(int[] kor, int[] eng, int[] mat, int[] sum, double[] mean, char[] grd) {
        for (int j = 0; j < 3; j++) {
            sum[j] = kor[j] + eng[j] + mat[j];
            mean[j] = sum[j] / 3.0;
            switch ((int) (mean[j] / 10)) {
                case 10:
                case 9:
                    grd[j] = '수';
                    break;
                case 8:
                    grd[j] = '우';
                    break;
                case 7:
                    grd[j] = '미';
                    break;
                case 6:
                    grd[j] = '양';
                    break;
                default:
                    grd[j] = '가';
            }
        }
    }

    //처리 결과 출력 : printSungJuk
    public static void printSungJuk(String[] name, int[] kor, int[] eng, int[] mat, int[] sum, int[] mean, char[] grd) {
        String fmt = "-----------\n이름 : %s\n국어 : %d\n수학 : %d\n영어 : %d\n-----------\n총점 : %d\n평균 : %.2f\n학점 : %c\n";
        for (int j = 0; j < 3; j++) {
            System.out.printf(fmt, name[j], kor[j], eng[j], mat[j], sum[j], mean[j], grd[j]);
        }
    }
}//class