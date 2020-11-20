package seoungcoding.sungjukV5.SungJukV5;

/**
 * 파일명: SungJukVO
 * 작성일 : 2020.11.17
 *
 * 프로그램 설명: 성적처리 프로그램 v5
 * 이름, 국어, 영어, 수학, 총점, 평균, 학점에
 * 관한 변수를 정의한 클래스
 * VO 클래스
 */

public class SungJukVO {
    private String name;
    private int kor;
    private int eng;
    private int mat;
    private int sum;
    private double mean;
    private char grd;


    public SungJukVO() {
    }

    public SungJukVO(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public SungJukVO(String name, int kor, int eng, int mat, int sum, double mean, char grd) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.sum = sum;
        this.mean = mean;
        this.grd = grd;
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

}
