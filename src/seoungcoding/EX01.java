package seoungcoding;

public class EX01 {
    public static void main(String[] args) {
        //학생 클래스를 이용해서 객체 생성
        //학과 클래스를 이용해서 객체 생성
        //과목 클래스를 이용해서 객체 생성
        //교수 클래스를 이용해서 객체 생성

        Student kim = new Student();
        Student song = new Student();
        Student zeon = new Student();
        Student su = new Student();
        Student ai = new Student();

        Department com = new Department();
        Department clo = new Department();
        Department food = new Department();
        Department phil = new Department();

        Subject prog = new Subject();
        Subject dress = new Subject();
        Subject life = new Subject();
        Subject devil = new Subject();

        Professor lee = new Professor();
        Professor jung = new Professor();
        Professor yusin = new Professor();
        Professor sung = new Professor();


        //각 객체에 대해 변수에 값 대입
        kim.studentNum = 201350050;
        kim.name = "김태희";
        kim.adress = "경기도고양시";
        kim.birth= "1985.3.22";
        kim.Dep_name= "컴퓨터";
        kim.professorNum = 504;

        song.studentNum = 201250006;
        song.name = "송혜교";
        song.adress = "서울영등포구";
        song.birth= "1988.9.17";
        song.Dep_name= "컴퓨터";
        song.professorNum = 301;

        zeon.studentNum = 201252110;
        zeon.name = "전지현";
        zeon.adress = "경기도의정부시";
        zeon.birth= "1986.4.30";
        zeon.Dep_name= "의상디자인";
        zeon.professorNum = 445;

        kim.studentNum = 201351010;
        kim.name = "수지";
        kim.adress = "서울성북구";
        kim.birth= "1988.7.13";
        kim.Dep_name= "식품영양";
        kim.professorNum = 556;

        kim.studentNum = 201353011;
        kim.name = "아이유";
        kim.adress = "경기도천안시";
        kim.birth= "1987.2.25";
        kim.Dep_name= "철학";
        kim.professorNum = 504;

        com.dep_name = "컴퓨터공학";
        com.phoneNum = "123-4567-8901";
        com.location = "E동 2층";
        com.dep_HeadNum = 504;

        clo.dep_name = "의상디자인";
        clo.phoneNum = "234-5678-9012";
        clo.location = "A동 1층";
        clo.dep_HeadNum = 301;

        food.dep_name = "식품영양";
        food.phoneNum = "345-6789-0123";
        food.location = "F동 8층";
        food.dep_HeadNum = 556;

        phil.dep_name = "철학";
        phil.phoneNum = "456-7890-1234";
        phil.location = "Z동 25층";
        phil.dep_HeadNum = 504;

        prog.sub_Num = 0205;
        prog.Sub_Name = "프로그래밍";
        prog.sub_Summary = "자바 프로그래밍";
        prog.professorNum = 301;

        dress.sub_Num = 0211;
        dress.Sub_Name = "드레스 코드";
        dress.sub_Summary = "옷 입기의 기초";
        dress.professorNum = 445;

        life.sub_Num = 5029;
        life.Sub_Name = "생활의 참견";
        life.sub_Summary = "음식의 영양";
        life.professorNum = 556;

        devil.sub_Num = 4111;
        devil.Sub_Name = "악마의 사도";
        devil.sub_Summary = "종교와 철학, 과학의 얽힘";
        devil.professorNum = 504;

        lee.professorNum = 301;
        lee.name = "이순신";
        lee.majorField = "프로그래밍";

        jung.professorNum = 445;
        jung.name = "정약용";
        jung.majorField = "의상디자인";

        yusin.professorNum = 556;
        yusin.name = "김유신";
        yusin.majorField = "식품영양";

        sung.professorNum = 504;
        sung.name = "이성계";
        sung.majorField = "철학";

        //객체에 저장된 값 출력



    }
}
