package seoungcoding.semiproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeV1Service extends EmployeeV1GenericService{
    List<EmployeeVO> Emdata = new ArrayList<>();
    EmployeeVO em = null;

    @Override
    public void newEmployee() {
         int empno;
         String fname;
         String lname;
         String email;
         String phone;
         String hdate;
         String jobid;
         int sal;
         double comm;
         int mgrid;
         int deptid;

        Scanner sc = new Scanner(System.in);
        System.out.print("직원 번호를 입력하시오 :" );
        empno = sc.nextInt();
        sc.skip("\r\n|[\n\r]");
        System.out.print("직원 이름을 입력하시오 :" );
        fname = sc.nextLine();
        System.out.print("직원 성을 입력하시오 :" );
        lname = sc.nextLine();
        System.out.print("이메일을 입력하시오 :" );
        email = sc.nextLine();
        System.out.print("전화번호를 입력하시오 :" );
        phone = sc.nextLine();
        System.out.print("입사 날짜를 입력하시오 :" );
        hdate = sc.nextLine();
        System.out.print("직책을 입력하시오 :" );
        jobid = sc.nextLine();
        System.out.print("연봉을 입력하시오 :" );
        sal = sc.nextInt();
        System.out.print("커미션을 입력하시오 :" );
        comm = sc.nextDouble();
        System.out.print("상사번호를 입력하시오 :" );
        mgrid = sc.nextInt();
        System.out.print("부서번호를 입력하시오 :" );
        deptid = sc.nextInt();
        //입력받은 인사데이터를 동적배열에 저장
        em = new EmployeeVO(empno, fname, lname, email, phone, hdate, jobid, sal, comm, mgrid, deptid);

        //처리된 인사데이터를 동적배열에 저장
        Emdata.add(em);
    }

    @Override
    public void readEmployee() {//(사번, 성, 이메일, 직책, 상사번호 , 부서번호)
        String fmt = "직원 번호:%d, 성:%s, 이메일:%s, 직책:%s, 상사번호:%d, 부서번호:%d\n";
        //동적 배열에 저장된 데이터들을 출력하기 위해
        //각 요소를 순회할수 있도록 Iterator 객체 선언
        Iterator<EmployeeVO> iter = Emdata.iterator();
        while (iter.hasNext()){
            EmployeeVO em = iter.next();
            System.out.printf(fmt, em.getEmpno(), em.getLname(), em.getEmail(), em.getJobid(), em.getMgrid(), em.getDeptid());
        }
    }

    public void readOneEmployee() {//(사번으로 조회, 모두다)
        String fmt = "직원 번호: %d ,직원 이름: %s ,직원 성: %s ,이메일: %s ,전화번호: %s ,입사 날짜: %s \n," +
                "직책: %s ,연봉: %d , 커미션: %.2f ,상사 번호: %d ,부서 번호: %d \n";

        //상세조회할 학생이름 입력 받음
        Scanner sc = new Scanner(System.in);
        System.out.print("조회할 사번 : ");
        int empno = sc.nextInt();

        //입력받은 이름으로 데이터 검색후 결과 출력
        for (EmployeeVO em : Emdata){
            if (em.getEmpno() == empno){
                System.out.printf(fmt, em.getEmpno(), em.getFname(),
                        em.getLname(), em.getEmail(), em.getPhone(), em.getHdate(), em.getJobid(),
                        em.getSal(),em.getComm(),em.getMgrid(),em.getDeptid());
                break;
            }
        }
    }

    @Override
    public void modifyEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 사번 : ");
        int empno = sc.nextInt();
        System.out.print("수정할 정보: \n[1.직원 번호, 2.직원 이름, 3.직원 성: ,4.이메일, 5.전화번호, 6.입사 날짜\n" +
                "7.직책, 8.연봉, 9.커미션, 10.상사 번호, 11.부서 번호]\n");
        sc.skip("\r\n|[\n\r]");
        String num = sc.nextLine();
        System.out.print("새롭게 넣을 정보: ");
        String input = sc.nextLine();
        int i=0;
        for (EmployeeVO em : Emdata){
            ++i;
            if (em.getEmpno() == empno) {
                switch (num) {
                    case "1": {
                        em.setEmpno(Integer.parseInt(input));
//                        Emdata.set(i, em.setEmpno(Integer.parseInt(input)));
                        break;
                    }
                    case "2": {
                        em.setFname(input);
//                        Emdata.set(i, em.setFname(input));
                        break;
                    }
                    case "3": {
                        em.setLname(input);
//                        Emdata.set(i, em.setLname(input));
                        break;
                    }
                    case "4": {
                        em.setEmail(input);
//                        Emdata.set(i, em.setEmail(input));
                        break;
                    }
                    case "5": {
                        em.setPhone(input);
//                        Emdata.set(i, em.setPhone(input));
                        break;
                    }
                    case "6": {
                        em.setHdate(input);
//                        Emdata.set(i, em.setHdate(input));
                        break;
                    }
                    case "7": {
                        em.setJobid(input);
//                        Emdata.set(i, em.setJobid(input));
                        break;
                    }
                    case "8": {
                        em.setSal(Integer.parseInt(input));
//                        Emdata.set(i, em.setSal(Integer.parseInt(input)));
                        break;
                    }
                    case "9": {
                        em.setComm(Double.parseDouble(input));
//                        Emdata.set(i, em.setComm(Double.parseDouble(input)));
                        break;
                    }
                    case "10": {
                        em.setEmpno(Integer.parseInt(input));
//                        Emdata.set(i, em.setEmpno(Integer.parseInt(input)));
                        break;
                    }
                    case "11": {
                        em.setEmpno(Integer.parseInt(input));
//                        Emdata.set(i, em.setEmpno(Integer.parseInt(input)));
                        break;
                    }
                    default: {
                        System.out.println("잘못 입력하셨습니다.");
                        break;
                    }

                }
            }

        }
    }

    @Override
    public void removeEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("제거할 사번 : ");
        int empno = sc.nextInt();
        for (EmployeeVO em : Emdata)
            if (em.getEmpno() == empno){
                Emdata.remove(em);
                break;
            }
    }

    public void displayMenu(){

        StringBuilder sb = new StringBuilder();
        sb.append("*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*\n")
                .append("|  인사관리 프로그램v1 |\n")
                .append("*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*\n")
                .append("|  1. 인사 정보 입력  |\n")
                .append("|  2. 인사 정보 조회  |\n")
                .append("|  3. 정보 상세 조회  |\n")
                .append("|  4. 인사 정보 수정  |\n")
                .append("|  5. 인사 정보 삭제  |\n")
                .append("|  0. 프로 그램 종료  |\n")
                .append("*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*\n")
                .append("원하는 작업[1,2,3,4,5,0]:");
        System.out.print(sb);
    }
}
