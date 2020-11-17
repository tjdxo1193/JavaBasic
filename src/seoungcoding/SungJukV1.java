package seoungcoding;

import java.util.Scanner;

/**
 * 파일명: SungJukV1
 * 작성일 : 2020.11.17
 *
 * 프로그램 설명: 성적처리 프로그램 v1
 * 이름, 국어, 영어, 수학 점수를 설정하면
 * 총점, 평균, 학점을 계산하고 결과출력
 * name, kor, eng, mat, sum, mean, grd
 * 학점 기준은 수우미양가로 함
 * 만점은 100점
 * 100~90, 89~80, 79~70, 69~60, 59~0 기준으로 학점 부여
 */
public class SungJukV1 {
    static String NAME = "신화섭";
    public static void main(String[] args) {
        Sung_JukV1(NAME, 99, 98, 99);
    }
    public static void Sung_JukV1(String name, int kor, int eng, int mat){
        int sum;
        double mean;
        char grd;

        sum = (kor + eng + mat);
        mean = (kor + eng + mat)/3.0;
        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("수학 : " + mat );
        System.out.println("----------");
        System.out.println("총점 : " + sum );
        System.out.println("평균 : " + mean );
        grd = ((mean <=100)&&(mean >=90)) ?
                '수':((mean <=89)&&(mean >= 80)) ?
                '우' : ((mean <=79)&&(mean >= 70)) ?
                '미': ((mean <=69)&&(mean >= 60)) ?
                '양' :'가';
        System.out.println("학점 : " + grd );
    }
}
