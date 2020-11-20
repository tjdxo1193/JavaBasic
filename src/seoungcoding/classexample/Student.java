package seoungcoding.classexample;

public class Student {
    int studentNum;
    String name;
    String adress;
    String birth;
    String Dep_name;
    int professorNum;

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getDep_name() {
        return Dep_name;
    }

    public void setDep_name(String dep_name) {
        Dep_name = dep_name;
    }

    public int getProfessorNum() {
        return professorNum;
    }

    public void setProfessorNum(int professorNum) {
        this.professorNum = professorNum;
    }

    public Student(){
        studentNum = 201250006;
        name = "송혜교";
        adress = "서울영등포구";
        birth = "1988.9.17";
        Dep_name = "컴퓨터";
        professorNum = 301;
    }
    public Student(int studentNum, String name, String adress, String birth, String dep_name, int professorNum) {
        this.studentNum = studentNum;
        this.name = name;
        this.adress = adress;
        this.birth = birth;
        this.Dep_name = dep_name;
        this.professorNum = professorNum;
    }
}
