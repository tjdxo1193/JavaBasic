package seoungcoding.sungjuk;

import seoungcoding.sungjukV5.SungJukV5.SungJukVO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * SungJukV8Service
 * 성적처리 추상클래스를 상속해서 만든 클래스
 */

public class SungJukV8Service extends SungJukV8GenericService {

    //멤버변수 선언
    //List<>
    //입력받은 모든 성적데이터를 저장하는 동적배열 변수 선언
    List<SungJukVO> sjdata = new ArrayList<>();
    //입력받은 성적데이터를 저장하는 변수
    SungJukVO sj = null;

    @Override
    /**
     * 이름과 성적 데이터를 입력받아
     * 총점, 평균 , 학점을 계산한 뒤
     * 동적배열에 추가함
     */
    public void newSungJuk() {
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

       //입력받은 성적데이터를 동적배열에 저장
        sj = new SungJukVO(name, kor, eng, mat);

        //총점, 평균, 학점으 계산하는 성적철
        computeSungJuk(sj);

        //처리된 성적데이터를 동적배열에 저장
        sjdata.add(sj);
    }

    @Override
    /**
     * 저장된 성적 데이터들 중에서
     * 번호, 이름, 국어, 영어, 수학만 뽑아서
     * 리스트 형태로 출력
     */
    public void readSungJuk() {
        String fmt = "이름:%s, 국어:%d, 영어 :%d, 수학:%d\n";
        //동적 배열에 저장된 데이터들을 출력하기 위해
        //각 요소를 순회할수 있도록 Iterator 객체 선언
        Iterator<SungJukVO> iter = sjdata.iterator();
        while (iter.hasNext()){
           SungJukVO sj = iter.next();

            System.out.printf(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat());
        }
    }

    @Override
    /**
     * 상세조회할 학생이름을 입력받아
     * 이름, 국어, 영어, 수학, 총점, 평균, 학점을 출력
     *
     */
    public void readOneSungJuk() {
        String fmt = "이름:%s, 국어:%d, 영어:%d, 수학:%d\n" +
                "총점:%d, 평균:%.1f, 학점:%s\n";

        //상세조회할 학생이름 입력 받음
        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 학생 이름 : ");
        String name = sc.nextLine();

        //입력받은 이름으로 데이터 검색후 결과 출력
        for (SungJukVO sj : sjdata){
            if (sj.getName().equals(name)){
                System.out.printf(fmt, sj.getName(), sj.getKor(),
                        sj.getEng(), sj.getMat(), sj.getSum(), sj.getMean(), sj.getGrd());
                break;
            }
        }
    }

    /**
     * 성적 처리 프로그램의 메뉴 출력 기능
     */
    public void displayMenu(){

        StringBuilder sb = new StringBuilder();
        sb.append("*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*\n")
                .append("|  성적 처리프로그램 v8    |\n")
                .append("*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*\n")
                .append("| 1. 성적 데이터 직접입력  |\n")
                .append("| 2. 성적 데이터 간단조회  |\n")
                .append("| 3. 성적 데이터 상세조회  |\n")
                .append("| 4. 성적 데이터 수정하기  |\n")
                .append("| 5. 성적 데이터 삭제하기  |\n")
                .append("| 0. 성적 프로그램 종료함  |\n")
                .append("*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*\n")
                .append("원하는 작업[1,2,3,4,5,0]:");
        System.out.print(sb);
    }


    public void computeSungJuk(SungJukVO sj){
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
    }
}
