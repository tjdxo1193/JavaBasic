package seoungcoding.semiproject;

import java.io.*;

public class EmployeeV2Service extends EmployeeV1Service{
    private String fpath = "c:/Java/Employee.dat";
    private FileReader fr = null;
    private FileWriter fw = null;
    private BufferedReader br = null;
    private BufferedWriter bw = null;

    @Override
    public void newEmployee() {
        super.newEmployee();

        try {
            writeEmployee(em);
        } catch (IOException e) {
            System.out.println("데이터를 불러오기 실패...");
        }
    }


    protected void writeEmployee(EmployeeVO em) throws IOException {
        String fmt = "%s,%s,%s,%s,%s,%s,%s,%s,%.2f,%s,%s";

        fw = new FileWriter(fpath,true);
        bw = new BufferedWriter(fw);

        String data = String.format(fmt, em.getEmpno(), em.getFname(),
                em.getLname(), em.getEmail(), em.getPhone(), em.getHdate(), em.getJobid(),
                em.getSal(),em.getComm(),em.getMgrid(),em.getDeptid());

        bw.write(data);
        bw.newLine();

        bw.close();
        fw.close();
    }


    public EmployeeV2Service(){
        try {
            loadEmployee();
        } catch (IOException e) {
            System.out.println("데이터 읽어오는 중...읽어올 파일 없음");
        }
    }

    protected void loadEmployee() throws IOException {
        fr = new FileReader(fpath);
        br = new BufferedReader(fr);

        while (br.ready()){
            String e[] = br.readLine().split(",");
            em = new EmployeeVO(Integer.parseInt(e[0]), e[1], e[2], e[3], e[4], e[5], e[6], Integer.parseInt(e[7]),
                    Double.parseDouble(e[8]), Integer.parseInt(e[9]), Integer.parseInt(e[10]));

            Emdata.add(em);
        }



        br.close();
        fr.close();
    }

    public void displayMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*\n")
                .append("|  인사관리 프로그램v2 |\n")
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
