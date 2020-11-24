package seoungcoding.Day1123;
//메서드 재정의 override
//객체지향 중요 3대개념중 다형성에 해당
//상속관계에 있는 상위클래스의 메서드를
//하위클래스에서 같은 이름의 메서드로 다시 작성하는 것을 의미
//즉, 상속 받은 메서드를 새로 정의해서 사용하는 것을 말함
public class Overriding {
    public static void main(String[] args) {
        Aniaml a = new Aniaml();
        Cat c = new Cat();
        Dog d = new Dog();

        System.out.println(a.cry());
        System.out.println(c.cry());
        System.out.println(d.cry());
    }
}

class Aniaml {
    protected String cry(){ return "동물이 웁니다";}
}
class Cat extends Aniaml{
    @Override
    protected String cry() {
        return "야옹 ~야옹~";
    }
}
class  Dog extends Aniaml{
    @Override
    protected String cry() {
        return "멍!멍!";
    }
}
