package seoungcoding.sungjuk;

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
 * 삼항 연산자
 */
public class SungJukV1 {
    static String NAME1 = "신화섭";
    static String NAME2 = "황성태";
    public static void main(String[] args) {

        Sung_JukV1(NAME1, 99, 98, 99);
        Sung_JukV1(NAME2, 58, 88, 48);
    }
    public static void Sung_JukV1(String name, int kor, int eng, int mat){
        //변수선언
        int sum = 0;
        double mean = 0.0;
        char grd = '가';

        //처리
        sum = (kor + eng + mat);
        mean = sum / 3.0;
        grd = (mean >=90) ? '수':
                (mean >= 80) ? '우':
                        (mean >= 70) ? '미':
                                (mean >= 60) ? '양': '가';

        //결과출력
        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("수학 : " + mat );
        System.out.println("----------");
        System.out.println("총점 : " + sum );
        System.out.println("평균 : " + mean );
        System.out.println("학점 : " + grd );
        System.out.println("----------");
    }
}