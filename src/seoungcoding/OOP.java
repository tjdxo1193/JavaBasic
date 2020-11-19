package seoungcoding;

//객체 지향 프로그래밍 개요
//모든 데이터를 객처로 취급하여 소프트 웨어를 개발하는 방식
//객체 : 실생활에서 우리가 인식하는 유.무형의 사물
//ex) 집, 자동차, 사람, 급여, 주문, ...

//클래스 : 객체를 만들어 내기 위한 틀, 설계도
//클래스에는 객체의 상태를 나타내는 필드/속성과
//객체의 기능을 나타내는 메소드로 구성됨

//클래스는 객체의 설계도이기 때문에
//실제 정보는 저장할 수 없음
//실제 정보를 저장하려면, 이것의 객체가 필요한데
//객체를 선언하는 과정을 개체화(instantate)라고 함
//개체화를 통해 나온 결과물을 객체/인스턴트라 하는데
//클래스에 정의된 필드와 기능이 실제 메모리상에 할당된 것

public class OOP {

    public static void main(String[] args) {
        //Person 클래스를 이용해서 객체 생성: 개체화
        //클래스명 객체명 = new 생성자;
        Person choi = new Person();
        Person lee = new Person();
        Person him = new Person();

        //객체의 변수에 값  대입: 멤버변수
        choi.name = "최승희";
        choi.job = "의사";
        choi.age = 45;
        choi.gender = "여";
        choi.blood = "A";

        lee.name = "이미녀";
        lee.job = "골프선수";
        lee.age = 28;
        lee.gender = "여";
        lee.blood = "O";

        him.name = "이미남";
        him.job = "교수";
        him.age = 47;
        him.gender = "남";
        him.blood = "AB";

        System.out.println(choi.name);
        System.out.println(choi.job);
        System.out.println(choi.age);
        System.out.println(choi.gender);
        System.out.println(choi.blood);
    }
}//class
//클래스 정의 : 접근제한자 클래스명 {
//  필드
//  메서드
//}
//최승희 : 의사, 45, 여, A
//이미녀 : 골프선수, 28, 여, O
//이미남 : 교수, 47, 남, AB
class Person {
    String name;
    String job;
    int age;
    String gender;
    String blood;
}