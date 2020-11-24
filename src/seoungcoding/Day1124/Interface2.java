package seoungcoding.Day1124;
//인터페이스는 대상을 바라보는 관점을 설명할 수 있음
//1. 식당에서 한끼를 해결하려는 손님 입장에서
//"불닭 돈까스" 는 하난의 메뉴임
//->단순한 정보일 뿐 복잡한 정보는 필요 없음

//2. 식당에서 요리하는 요리사 입장에서
//"불닭 돈까스'는 하나의 음식임
//->요리이므로 복잡한 정보가 필요함

//3. 식당에서 고객과 요리사를 관리하는 주인의 입장에서
//"불닭 돈까스"는 하나의 상품임
//->하나의 사업이므로 식당운영에 필요한 정보 필요

//같은 대상이라도 자신의 입자에서 바라보는 시선이 다름
//-> 프로그램잉 세계에서는 특정 대상에 대해
//누구나 동일한 시선을 제공해야 할 필요가 있음
//-> 인터페이스를 강제할 수 있음

//대부분의 음식점에서 "불닭 돈까스"를 요리하고 있음
//하지만, 요리사의 역량에 따라 기본은 지켜가면서
//제각각의 결과물을 만들어 냄
//어는 음식점을 가더라도 조금의 차이는 존재하지만
//"불닭돈까스" 라는 음식은 비슷하게 만들어 내고 있음

//기본 base클래스
//인터페이스를 구현하면 자식클래스에는 추상메서드를
//반드시 재정의해야함
//만일, 재정의 하고 싶지 않거나 , 재정의할 필요가 없는데도
//재정의해야만하는 불편함이 존재할 수 있음
//->이럴경우에 추상클래스를 통해 임의로 구현한 다음
//이 추상클래스를 상속해서 클래스를 만드는 것이 편리함
//이때 만든 클래스를 기본클래스라 함

//실질적인예
//https://github.com/javaee/servlet-spec
//src/main/java/javax.servlet => Servlet.java
//src/main/java/javax.servlet => GenricServlet.java
//src/main/java/javax.servlet/http => HttpServlet.java
public class Interface2 {
    public static void main(String[] args) {

    }
}
class Animal4 {
    protected int height;
    protected int weight;

}

interface Animal4Action{
    String cry();

}

abstract class Animal4Base extends Animal4 implements Animal4Action{
    @Override
    public String cry(){
        return"동물이웁니다.";
        }

}

class Cat4 extends Animal4 implements Animal4Action {
    @Override
    public String cry() {
        return "야옹야옹";
    }
}
class Dog4 extends Animal4 implements Animal4Action{
    @Override
    public String cry() {
        return "멍명";
    }
}

class Murloc extends Animal4 implements Animal4Action{

    @Override
    public String cry() {
        return "아훓훓훓~";
    }
}
