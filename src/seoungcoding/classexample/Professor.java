package seoungcoding.classexample;

public class Professor {
    String name;
    String  majorField;
    int professorNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajorField() {
        return majorField;
    }

    public void setMajorField(String majorField) {
        this.majorField = majorField;
    }

    public int getProfessorNum() {
        return professorNum;
    }

    public void setProfessorNum(int professorNum) {
        this.professorNum = professorNum;
    }

    public Professor(String name, String majorField, int professorNum) {
        this.name = name;
        this.majorField = majorField;
        this.professorNum = professorNum;
    }
}
