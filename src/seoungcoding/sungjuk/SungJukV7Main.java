package seoungcoding.sungjuk;

import seoungcoding.sungjukV5.SungJukV5.SungJukVO;

import java.util.Scanner;

/**
 * 파일명: SungJukV7Main
 * 작성일 : 2020.11.23
 *
 * 프로그램 설명: 성적처리 프로그램 v7
 * 중간 고사와 기말고사 성저처리프로그램을 만들려고 함
 * SungJukV6Main을 토대로 중간고사 성적과 기말고사 성적 클래스를
 * 인터페이스를 이용해서 작성하세요
 *
 * 부모클래스는 SungJukV7
 * 인터페이스 ISungJukV6
 * 중간고사 midSungJuk2 : 국어, 영어, 수학
 * 기말고사 FinalSungJuk2: 국어 ,영어, 수학, 미술art. 과학sci
 * 성적입력 : readSungjuk
 * 성적처리 : computeSungjuk
 * 결과출력 : printSungjuk
 *
 */

public class SungJukV7Main {
    public static void main(String[] args) {

        MidSungJuk mid = new MidSungJuk();
        FinalSungJuk fin = new FinalSungJuk();

        mid.readSungJuk();
        mid.computeSungJuk();
        mid.printSungJuk();

        fin.readSungJuk();
        fin.computeSungJuk();
        fin.printSungJuk();
    }
}
class SungJukV7{
    protected String name;
    protected int kor;
    protected int eng;
    protected int mat;
    protected int art;
    protected int sci;
    protected int sum;
    protected double mean;
    protected char grd;

    public SungJukV7(String name, int kor, int eng, int mat, int art, int sci) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.art = art;
        this.sci = sci;
    }
    public SungJukV7(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }
    public SungJukV7() {
    }
}
interface ISungJukV6{
    abstract void computeSungJuk();
    abstract void readSungJuk();
    abstract void printSungJuk();
}
class MidSungJuk2 extends SungJukV7 implements ISungJukV6{
    public MidSungJuk2() {}
    public MidSungJuk2(String name, int kor, int eng, int mat) {
        super(name, kor, eng, mat);
    }
    @Override
    public void computeSungJuk(){//총합
        sum = (kor + eng + mat);
        mean = sum / 3.0;
        grd = (mean >=90) ? '수':
                (mean >= 80) ? '우':
                        (mean >= 70) ? '미':
                                (mean >= 60) ? '양': '가';
    }//computeSungJuk
    @Override
    public void readSungJuk(){
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력하시오 :" );
        name = sc.nextLine();
        System.out.print("국어점수를 입력하시오 :" );
        kor = sc.nextInt();
        System.out.print("영어점수를 입력하시오 :" );
        eng = sc.nextInt();
        System.out.print("수학점수를 입력하시오 :" );
        mat = sc.nextInt();
    }//readSungJuk
    @Override
    public void printSungJuk(){
        String fmt = "이름 : %s\n국어 : %d\n수학 : %d\n영어 : %d\n총점 : %d\n평균 : %.2f\n학점 : %c";
        String result;
        result = String.format(fmt, name, kor, eng, mat,
                sum, mean, grd);
        System.out.println(result);
    }//printSungJuk
}
class FinalSungJuk2 extends SungJukV7 implements ISungJukV6{
    public FinalSungJuk2() {
    }
    public FinalSungJuk2(String name, int kor, int eng, int mat, int art, int sci) {
        super(name, kor, eng, mat, art, sci);
    }
    @Override
    public void computeSungJuk() {
        //부모클래스에 정의된 총점 변수를
        //super라는 이름으로 치환해서 호출할 수 잇음
        //super.멤버변수명
        //super.computeSungJuk();
        //sum - super.sum + sci + art;
        sum = (kor + eng + mat + art + sci);
        mean = sum / 5.0;
        grd = (mean >=90) ? '수':
                (mean >= 80) ? '우':
                        (mean >= 70) ? '미':
                                (mean >= 60) ? '양': '가';
    }//computeSungJuk
    @Override
    public void readSungJuk(){
        //부모클래스에 정의된 성적 입력코드를
        //super라는 이름으로 치환해서 호출할 수 있음
        //super.메서드 이름()
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력하시오 :" );
        name = sc.nextLine();
        System.out.print("국어점수를 입력하시오 :" );
        kor = sc.nextInt();
        System.out.print("영어점수를 입력하시오 :" );
        eng = sc.nextInt();
        System.out.print("수학점수를 입력하시오 :" );
        mat = sc.nextInt();
        System.out.print("미술점수를 입력하시오 :" );
        art = sc.nextInt();
        System.out.print("과학점수를 입력하시오 :" );
        sci = sc.nextInt();
    }//readSungJuk
    @Override
    public void printSungJuk(){
        String fmt = "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n미술 : %d\n과학 : %d\n총점 : %d\n평균 : %.2f\n학점 : %c";
        String result;
        result = String.format(fmt, name, kor, eng, mat, art, sci,
                sum, mean, grd);
        System.out.println(result);
    }
}