package seoungcoding.classexample;

public class Department {
    String dep_name;
    String phoneNum;
    String location;

    public Department(String dep_name, String phoneNum, String location, int dep_HeadNum) {
        this.dep_name = dep_name;
        this.phoneNum = phoneNum;
        this.location = location;
        this.dep_HeadNum = dep_HeadNum;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDep_HeadNum() {
        return dep_HeadNum;
    }

    public void setDep_HeadNum(int dep_HeadNum) {
        this.dep_HeadNum = dep_HeadNum;
    }

    int dep_HeadNum;
}
