package seoungcoding.Day1123;
//인터페이스
//추상메서드와 상수만로 구성된 특수한 클래스
//어떤 클래스를 만들때 추상메서드를 통해
//기본이 되는 틀을 제공하여 규칙에 맞춰
//코드를 짤 수 있게 해줌
//클래스와는 달리 다중상속을 지원함

//인터페이스 작성시 interface 를 사용
//안터페이스를 구현할 때는 implements를 사용

public class Interface {

}
class Animal3{
    protected int weight;
    protected int height;
}

interface Animal3Action{
    //public static String COLOR = "brown";
    //static String COLOR = "brown";
    String COLOR = "brown";
    //public abstract String cry();
    //abstract String cry();
    abstract String cry();
}

class Cat3 extends Animal3 implements Animal3Action {
    @Override
    public String cry() {
        return "야옹야옹";
    }
}
class Dog3 extends Animal3 implements Animal3Action{
    @Override
    public String cry() {
        return "멍명";
    }
}

class Murloc extends Animal3 implements Animal3Action{

    @Override
    public String cry() {
        return "아훓훓훓~";
    }
}