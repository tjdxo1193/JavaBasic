package seoungcoding.Day1123;

public class Overloading {
    public static void main(String[] args) {
        NonOverloading nol = new NonOverloading();
        ApplyOverloading aol = new ApplyOverloading();

        System.out.println(nol.Sumii(10, 10));
        System.out.println(nol.Sumiii(10, 10, 10));
        System.out.println(nol.Sumdd(10.0 ,10.0));

        System.out.println(aol.Sum(10, 10));
        System.out.println(aol.Sum(10, 10, 10));
        System.out.println(aol.Sum(10.0 ,10.0));

    }
}

class NonOverloading{
    //간단한 덧셈 프로그램
    //1. 정수2개를 더하는 프로그램
    public int Sumii(int a, int b){
        return a+b;
    }
    //2. 실수2개를 더하는 프로그램
    public double Sumdd(double a, double b){
        return a+b;
    }
    //3. 정수 3개를 더하는 프로그램
    public int Sumiii(int a, int b, int c){
        return a+b+c;
    }

    //메서드 오버로딩이 구현되지 않은 경우
    //생성한 메서드마다 이름을 제가각으로 정해야하므로
    //개발자가 일일히 기억해서 사용해야 하는 불편 초래
}

class ApplyOverloading{
    public int Sum(int a, int b){
        return a+b;
    }
    //2. 실수2개를 더하는 프로그램
    public double Sum(double a, double b){
        return a+b;
    }
    //3. 정수 3개를 더하는 프로그램
    public int Sum(int a, int b, int c){
        return a+b+c;
    }

    //메서드 다중정의를 적용하면
    //메서드의 이름을 하나로 통일해서 작성 가능
    //개발자가 외울 메서드의 이름이 줄어듬
    //단, 메서드를 어떻게 호출할지만 알고 있을면 됨
}