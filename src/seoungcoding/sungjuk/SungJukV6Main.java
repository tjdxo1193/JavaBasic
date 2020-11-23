package seoungcoding.sungjuk;
import seoungcoding.sungjukV5.SungJukV5.SungJukVO;

import java.util.Scanner;

/**
 * 파일명: SungJukV6Main
 * 작성일 : 2020.11.23
 *
 * 프로그램 설명: 성적처리 프로그램 v6
 * 중간 고사와 기말고사 성저처리프로그램을 만들려고 함
 * SungJukV1을 토대로 중간고사 성적과 기말고사 성적 클래스를
 * 상속을 이용해서 작성하세요
 *
 * 중간고사 midSungJuk : 국어, 영어, 수학
 * 기말고사 FinalSungJuk: 국어 ,영어, 수학, 미술art. 과학sci
 * 성적처리 : computeSungjuk
 * 결과출력 : printSungjuk
 * 관한 변수를 정의한 클래스
 *
 */

public class SungJukV6Main {
    public static void main(String[] args) {

        MidSungJuk2 mid = new MidSungJuk2();
        FinalSungJuk2 fin = new FinalSungJuk2();

        mid.readSungJuk();
        mid.computeSungJuk();
        mid.printSungJuk();

        fin.readSungJuk();
        fin.computeSungJuk();
        fin.printSungJuk();
    }

}

class MidSungJuk{
    protected String name;
    protected int kor;
    protected int eng;
    protected int mat;
    protected int sum;
    protected double mean;
    protected char grd;

    public MidSungJuk() {
    }

    public MidSungJuk(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public MidSungJuk(String name, int kor, int eng, int mat, int sum, double mean, char grd) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.sum = sum;
        this.mean = mean;
        this.grd = grd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public char getGrd() {
        return grd;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }
    /**
     * 입력 받은 성적에 대해
     * 총점 평균 학점을 계산하는 메서드
     */
//원본까지 같이 바뀜 매개변수로 클래스를 참조로 넣으면
    protected void computeSungJuk(){//총합
        sum = (kor + eng + mat);
        mean = sum / 3.0;
        grd = (mean >=90) ? '수':
                (mean >= 80) ? '우':
                        (mean >= 70) ? '미':
                                (mean >= 60) ? '양': '가';
        }//computeSungJuk
    protected void readSungJuk(){
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
    protected void printSungJuk(){
        String fmt = "이름 : %s\n국어 : %d\n수학 : %d\n영어 : %d\n총점 : %d\n평균 : %.2f\n학점 : %c";
        String result;
        result = String.format(fmt, name, kor, eng, mat,
                sum, mean, grd);
        System.out.println(result);
    }
}
class FinalSungJuk extends MidSungJuk{
    private int art;
    private int sci;

    public FinalSungJuk() {
    }

    public FinalSungJuk(int art, int sci) {
        this.art = art;
        this.sci = sci;
    }

    public FinalSungJuk(String name, int kor, int eng, int mat, int art, int sci) {
        super(name, kor, eng, mat);
        this.art = art;
        this.sci = sci;
    }
    public int getArt() {
        return art;
    }

    public void setArt(int art) {
        this.art = art;
    }

    public int getSci() {
        return sci;
    }

    public void setSci(int sci) {
        this.sci = sci;
    }

    @Override
    protected void computeSungJuk() {
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
    protected void readSungJuk(){
        //부모클래스에 정의된 성적 입력코드를
        //super라는 이름으로 치환해서 호출할 수 있음
        //super.메서드 이름()

        super.readSungJuk();
        Scanner sc = new Scanner(System.in);
        System.out.print("미술점수를 입력하시오 :" );
        art = sc.nextInt();
        System.out.print("과학점수를 입력하시오 :" );
        sci = sc.nextInt();
    }//readSungJuk

    //부모클래스에 정의된 멤버변수 초기화 고드를
    //super 라는 이름으로 치환해서 호출할 수 있슴
    //super(생성자 매개변수목록
    @Override
    protected void printSungJuk(){
        String fmt = "이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n미술 : %d\n과학 : %d\n총점 : %d\n평균 : %.2f\n학점 : %c";
        String result;
        result = String.format(fmt, name, kor, eng, mat, art, sci,
                sum, mean, grd);
        System.out.println(result);
    }
}