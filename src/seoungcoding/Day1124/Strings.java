package seoungcoding.Day1124;
//Stirng 클래스
//C언어에서는 문자열은 char형 배열로 표현
//자바에서는 문자열 처리를 위한 별도의 String 클래스 제공

//String클래스의 객체는 한번 생성되면
//그 값을 읽기만 가능하고 변경할 수 없는 불변객체임
//따라서, + 연산자로 문자열을 결합하는 경우
// 기존의 문자열이 변경되는 것이 아니고
//각각의 내용을 합쳐 새로운 객체를 생성함
public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World!!";
        str1 = str1 + str2;
        str1 = str1 + "Wow~"; //메모리 낭비가 심함
        // => StringBuffer, StringBuilder 추천
        StringBuffer sb = new StringBuffer();
        sb.append("hello").append("World!!").append("Wow~");
        System.out.println(sb);

        //문자열 비교
        //문자열 상수 풀이라는 개념 이해 필요
        //a 객체 생성 ->"Hello"를 SCP에 저장
        //b 객체 생성 ->SCP에 이미 존재하므로 같은 값이 참조하도록 함
        //c 객체 생성 -> 새로운 위치에 "Hello"를 생성

        //문자열 변수간 비교에서 == 연산자는
        // 갓을 비교하는 것이 아니고
        // 값이 저장된 메모리상의 위치를 비교함(중요!)

        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");
        //a,b는 같을까? 또한 a, c도 같을까?
        //system.out.println(a == b + a == c + b == c);
        //따라서, 문자열간 값을 비교할때는
        //equals 메서드를 사용해야함

        if(a.equals(b)){
            System.out.println("Yes");
        }else
            System.out.println("no");
        if(a.equals(c)){
            System.out.println("Yes");
        }else
            System.out.println("no");
        if(b.equals(c)){
            System.out.println("Yes");
        }else
            System.out.println("no");
    }
}
