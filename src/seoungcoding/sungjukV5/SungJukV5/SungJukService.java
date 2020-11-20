package seoungcoding.sungjukV5.SungJukV5;
//기능, 출력

import java.util.Scanner;

/**
 * 파일명: SungJukService
 * 작성일 : 2020.11.17
 *
 * 프로그램 설명: 성적처리 프로그램 V5
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
 *
 */
public class SungJukService {

    /**
    *성적 데이터 입력 메서드
    *return 키보드로 입력받은 성적데이터 SungJukVO
    **/



    public SungJukVO readSungJuk(){
        String name;
        int kor, eng, mat;

        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력하시오 :" );
        name = sc.nextLine();
        System.out.print("국어점수를 입력하시오 :" );
        kor = sc.nextInt();
        System.out.print("영어점수를 입력하시오 :" );
        eng = sc.nextInt();
        System.out.print("수학점수를 입력하시오 :" );
        mat = sc.nextInt();

        return new SungJukVO(name, kor, eng, mat);

    }//readSungJuk

    /**
     * 입력 받은 성적에 대해
     * 총점 평균 학점을 계산하는 메서드
     */
//원본까지 같이 바뀜 매개변수로 클래스를 참조로 넣으면
    public void computeSungJuk(SungJukVO sj){//총합
        sj.setSum(sj.getKor() + sj.getEng() + sj.getMat());
        sj.setMean(sj.getSum()/3.0);
        switch ((int) (sj.getMean() / 10)) {
            case 10:
            case 9:
                sj.setGrd('수');
                break;
            case 8:
                sj.setGrd('우');
                break;
            case 7:
                sj.setGrd('미');
                break;
            case 6:
                sj.setGrd('양');
                break;
            default:
                sj.setGrd('가');
        }
    }//computeSungJuk

    /**
     *
     *
     */
    public void printSungJuk(SungJukVO sj){
        String fmt = "이름 : %s\n국어 : %d\n수학 : %d\n영어 : %d\n총점 : %d\n평균 : %.2f\n학점 : %c";
        String result;
        result = String.format(fmt, sj.getName(), sj.getKor(), sj.getEng(),sj.getMat(),
                sj.getSum(), sj.getMean(), sj.getGrd());
        System.out.println(result);

    }

}
