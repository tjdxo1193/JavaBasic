package seoungcoding.classexample;

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

        //매개변수 생성자를 이용한 객체 생성 및 초기화
        Person choi;
        choi = new Person("최승희","의사",45, "여", "A");
        Person lee = new Person("이미녀", "골프선수", 28, "여", "O");
        Person him = new Person("이미남", "교수", 47, "남", "Ab");


        choi.print(choi);
        //객체의 변수(멤버변수)에 값 대입
        //각 변수별로 값을 대입하는 것은 다소 불편
        //생성자를 이용하면 좀 더 값을 편하게 대입할 수 있음

        //객체의 변수에 값  대입: 멤버변수


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
    public static String name;
    public static String job;
    public static int age;
    public static String gender;
    public static String blood;

    public Person(){

    }


    //생성자 constructor
    //멤버변수의 값을 초기화 시키는 특별한 메서드
    //public 클래스명(매개변수, ...){
    // 변수초기화
    //}

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public static int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
    //매개변수를 사용하는 생성자
    //매개변수명과 맴버변수명이 같은 경우
    //변수 가림 shadowing 현상 발생
    //클래스의 멤버변수임을 명확하게 표현하기 위해
    //변수명 앞에 this라는 키워드를 추가 작성
    public Person(String name, String job, int age, String gender, String blood){
        name = this.name;
        job = this.job;
        age = this.age;
        gender = this.gender;
        blood = this.blood;

        System.out.println("-----------\n이름: " +
                getName() + "\n직업: " +
                getJob()+"\n나이: " + getAge() + "\n성별: " +
                getGender() + "\n혈액형: " +
                getBlood());
    }

    public void print(Person p){
        System.out.println("-----------\n이름: " +
                p.getName() + "\n직업: " +
                p.getJob()+"\n나이: " + p.getAge() + "\n성별: " +
                p.getGender() + "\n혈액형: " +
                p.getBlood());
    }
}