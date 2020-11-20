package seoungcoding.classexample;

public class Subject {
    int sub_Num;
    String Sub_Name;
    String sub_Summary;

    public int getSub_Num() {
        return sub_Num;
    }

    public void setSub_Num(int sub_Num) {
        this.sub_Num = sub_Num;
    }

    public String getSub_Name() {
        return Sub_Name;
    }

    public void setSub_Name(String sub_Name) {
        Sub_Name = sub_Name;
    }

    public String getSub_Summary() {
        return sub_Summary;
    }

    public void setSub_Summary(String sub_Summary) {
        this.sub_Summary = sub_Summary;
    }

    public int getProfessorNum() {
        return professorNum;
    }

    public void setProfessorNum(int professorNum) {
        this.professorNum = professorNum;
    }

    public Subject(int sub_Num, String sub_Name, String sub_Summary, int professorNum) {
        this.sub_Num = sub_Num;
        Sub_Name = sub_Name;
        this.sub_Summary = sub_Summary;
        this.professorNum = professorNum;
    }

    int professorNum;
}
