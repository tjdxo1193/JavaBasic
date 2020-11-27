package seoungcoding.sungjuk;

import java.util.Scanner;

/**
 * SungjukV9Main
 * 작성일 : 2020.11.27
 * 프로그램 설명: 성적처리프로그램 v9
 * 성적처리 프로그램에 저장기능을 추가함
 * 즉, sungjuk.dat라는 파일을 생성해서
 * 입력한 성적데이터를 여기에 저장해 둠
 *
 * SungJukService : readSungJuk, showSungJuk,
 *          showOneSungJuk, modifySungJuk , removeSungJuk
 *         displayMenu, compureSungJuk
 */
public class SungJukV9Main {
    public static void main(String[] args) {
        SungJukV9Service sjsrv = new SungJukV9Service();
        Scanner sc = new Scanner(System.in);
        String menu = null;
        while (true) {
            sjsrv.displayMenu();
            menu = sc.nextLine();
            switch (menu){
                case "1": sjsrv.newSungJuk(); break;
                case "2": sjsrv.readSungJuk();break;
                case "3": sjsrv.readOneSungJuk();break;
                case "4": break;
                case "5": break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }

        }
    }
}
