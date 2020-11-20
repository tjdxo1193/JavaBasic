package seoungcoding.classexample;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
        * 파일명 : Sungjukv4
        * 작성일 : 2020.11.18
        *
        * 프로그램 설명 : 성적 처리 프로그램 v4
        * 학생 3 명의 성적 데이터를 키보드로 입력 받아
        * 총점, 평균, 학점을 계산하고 결과 출력
        * (단, 평균은 소수점 첫째 자리까지 출력)
        * 성적 처리 결과 출력시 출력문을 하나만 사용하기로 함
        *
        * 학점 기준은 수 우미 양가로하되 Switch 문으로 계산하도록 함.
        *
        * 변수 : 이름, kor, eng, mat, sum, mean, grd
        *
        * 성적 처리 기능을 구현하고 코드가 길어지고
        * 내용 파악이 어려워지는 것을 방지하기 위해
        * 함수 (메소드)로 재정 의해서 코드를 개선 함.
        *
 * */

public class Method {
    public static void main(String[] args) {

        String result = sayHello3("안녕하세요, 세상아!");
        System.out.println(result);
        // 메소드 란?
        // 특정 작업을 수행하기 위해 행사들의 묶음
        // C 언어의 함수와 성격을 수식 요소
        // 입력 값을 통해 무엇인가를하고 그 결과를 토출하는
        // 수학의 함수 (블랙 박스)와 개념

        // 방법 의 목적
        // 프로그램을 작성하다 보면 반복적으로 쓰인 코드를 종종 많다.
        // 많이 작성하여 광고 반복문 처리하면,
        // 반복 반복문이 반복 문이 메소드를 적용하면
        // 기능별로 모듈화를 적용 할 수 있기 때문에
        // 프로그램의 가독성이 좋아지고, 협업시에도 유용하며 변경시 유지 보수에도 기능

        // 메서드 정의
        // 접근 제 한자 리턴 값 메소드 이름 (매개 국내 타입 순환 명) {
        //             메소드 (구현 부)
        // }
        sayHello2("Hello, Java!!");
        computeAllSum(1, 5);
    }
    // 간단한 생산
    // public : 접근 제 한자, 외부 클래스의 메소드 사용 허가 여부
    // static : 정적 메서드, 객체 생성없이 바로 사용 가능 여부
    // void : 리턴 타입
    public  static  void  sayHello () {
        for ( int i =  0 ; i <  3 ; i ++ )
            System.out.println(" Hello, World !! " );
    }
    // 간단한 생산을 출력하는 방법
    // 단, 생산을 언제든 변경하도록 재 작성
    public static void sayHello2(String str){
        for(int i = 0; i <3 ;i ++)
            System.out.println(str);
    }
    //간단한 인사말을 출력하는 메서드 : sayHello3
    //단 , 인삿말을 언제든 병경하도록 재장성
    //단, 인삿말 출력을 메서드가 바로 하지 않고
    //호출한 대상으로 넘김
    //return : 메서드내에서 처리한 값을 외부로 보내려면
    //return이라는 명령문 사용
    //return시 갑의 type과 메서드의 return type은
    //반드시 일치해야 함

    public static String sayHello3(String name){
        return name;
    }
    //두개의 정수를 매개변수로 선언하고
    // 사칙연산한 결과를 출력 하는 메서드:

    public static void computeNum(int f, int s){
        int sum = f+s;
        int mul = f*s;
        int div = f/s;
        int sub = f-s;

        System.out.println(f+" + "+ s + " = " +sum);
        System.out.println(f+" - "+ s + " = " +sub);
        System.out.println(f+" * "+ s + " = " +mul);
        System.out.println(f+" / "+ s + " = " +div);
    }
    public static void computeAllSum(int s, int e){
        int min;
        int max;
        min = s;
        max = e;
        String fmt = "%d ~ %d 정수 범위 총합 : %d";
        if(s > e){min = e; max = s;}
        int Sum= 0;
        for(int i = min; i <= max ;++i){
            Sum += i;
        }
        System.out.printf(fmt, min, max, Sum);
    }

    public static void computeAllSum2(int s, int e){
        int min;
        int max;
        min = s;
        max = e;
        String fmt = "%d ~ %d 정수 범위 총합 : %d";
        if(s > e){min = e; max = s;}
        if(s != 1){
            int Sum = (s*(s+1)/2) - (e*(e+1) / 2);
        }
        int Sum= e*(e+1) / 2;


        System.out.printf(fmt, min, max, Sum);

    }

}