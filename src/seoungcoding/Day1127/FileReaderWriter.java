package seoungcoding.Day1127;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 스트림stream
 * 데이터를 비트등의 단위로 조각내어 일련의 연속성을
 * 갖도록 만든 데이터들의 열
 * 일반적으로 스트림이라하면 이러한 데이터의 열과
 * 이것을 활용하기 위해 사용하는 모듈을 합쳐 부르는 것
 *
 * 스트림은 데이터를 읽고 쓰기 위한 공통된 방법 제공
 * 자바에서 스트림 처리방식은
 * 보는 바이트 단위 스트림과 문자 데이터만을 위한
 * 문자 단위스트림이 있음
 *
 * 문자스트림을 다루는 클래스 : java. io패키지에 포함
 * Reader/Writer -> FileReader/ FileWriter
 */
public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        //자신의 이름, 키, 나이를 ,파일에 저장
        String name = "성태";
        int height = 175;
        int age = 24;

        //파일에 기록
        //데이터를 저장할 위치와 파일명 지정
        String fpath = "c:/Java/info.txt";
        //파일 쓰기(문자출력스트림) 객체 생성
        FileWriter fw = new FileWriter(fpath);

        //파일에 내용 쓰기
        fw.write(name+"\n");
        fw.write(height+"\n");
        fw.write(age+"\n");

        //파일쓰기 끝을 알림
        fw.close();

        //파일에 저장된 데이터를 출력하기 1
        //한 문자씩 읽어와서 출력

        //파일로 부터 문자 하나를 읽어서 화면에 출력
        //이러한 작업을 더이상 읽을 문자가 없을때 까지 반복
        //아스키코드는 문자하나에 할당된 숫자코드
        FileReader fr = new FileReader(fpath);
        int ch = 0;
        while ((ch = fr.read())!= -1){
            System.out.println(ch + "/" + (char)ch);
        }
        //파일읽기가 끝나면 작업 마무리
        fr.close();

        //파일에 저장된 데이터를 화면에 출력하기 2
        //한 행씩 읽어와서 출력
        //BufferedReader를 사용하면
        //속도가 빠름
        fr= new FileReader(fpath);
        BufferedReader br = new BufferedReader(fr);
        //읽어올 데이터가 있는지 확인
        while (br.ready()){
            //만일, 있다면 한행씩 읽어서 화면에 출력
            System.out.println(br.readLine());
        }

        //파일읽기가 끝나면 작업 마무리
        //
        br.close();
        fr.close();

    }
}
