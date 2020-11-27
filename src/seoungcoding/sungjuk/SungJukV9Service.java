package seoungcoding.sungjuk;

import seoungcoding.sungjukV5.SungJukV5.SungJukVO;

import java.io.*;

/**
 * SungJukV8Service
 * 성적처리 추상클래스를 상속해서 만든 클래스
 */

public class SungJukV9Service extends SungJukV8Service {

    private String fpath = "c:/Java/sungjuk.dat";
    private FileReader fr = null;
    private FileWriter fw = null;
    private BufferedReader br = null;
    private BufferedWriter bw = null;

    public void displayMenu(){

        StringBuilder sb = new StringBuilder();
        sb.append("*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*\n")
                .append("|  성적 처리프로그램 v9    |\n")
                .append("*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*\n")
                .append("| 1. 성적 데이터 직접입력  |\n")
                .append("| 2. 성적 데이터 간단조회  |\n")
                .append("| 3. 성적 데이터 상세조회  |\n")
                .append("| 4. 성적 데이터 수정하기  |\n")
                .append("| 5. 성적 데이터 삭제하기  |\n")
                .append("| 0. 성적 프로그램 종료함  |\n")
                .append("*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ*\n")
                .append("원하는 작업[1,2,3,4,5,0]:");
        System.out.print(sb);
    }

    /**
     * SungJukService의 newSungJuk을 재정의
     */
    @Override
    public void newSungJuk() {
        //성적데이터 입력받은 후
        // arrayList 객체에 저장
        super.newSungJuk();

        try{
            writeSungJuk(sj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * writeSungJuk
     * 입력받은 성적데이터를 sungjuk.dat에 저장
     */

    protected void writeSungJuk(SungJukVO sj) throws IOException {
        String fmt = "%s,%s,%s,%s,%s,%.1f,%s";
        //파일 기록시 추가append 기능을 활성화함함
        fw = new FileWriter(fpath, true);
        bw = new BufferedWriter(fw);

        String data = String.format(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(), sj.getSum(), sj.getMean(), sj.getGrd());

        bw.write(data);
        bw.newLine(); //줄바꿈 메서드

        bw.close();
        fw.close();
    }

    public SungJukV9Service() {
        //프로그램 최초시작시
        //파일에 저장된 모든 성적데이터를
        //List타입의 sjdata변수에 저장
        try {
            loadSungJuk();
        } catch (IOException e) {
            System.out.println("성적데이터 읽어오는 중...\n읽어올 파일 없음");
        }
    }

    /**
     * loadSungJuk
     * 파일에 저장된 성적데이터를
     * List타입의 sjdata에 저장
     *
     */

    protected void loadSungJuk() throws IOException{
        fr = new FileReader(fpath);
        br = new BufferedReader(fr);

        while (br.ready()){
            String s[] = br.readLine().split(",");
            sj = new SungJukVO(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]),Integer.parseInt(s[3])
                    ,Integer.parseInt(s[4]),Double.parseDouble(s[5]),s[6].charAt(0));

            //파일에서 읽어온 성적데이터 하나를
            //List변수 sjdata에 추가함
            sjdata.add(sj);
        }

        br.close();
        fr.close();
    }
}