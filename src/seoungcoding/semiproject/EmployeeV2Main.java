package seoungcoding.semiproject;

import java.util.Scanner;

public class EmployeeV2Main {
    public static void main(String[] args) {
        EmployeeV2Service epvs = new EmployeeV2Service();
        Scanner sc = new Scanner(System.in);
        String menu = null;
        while (true) {
            epvs.displayMenu();
            menu = sc.nextLine();
            switch (menu){
                case "1": epvs.newEmployee(); break;
                case "2": epvs.readEmployee();break;
                case "3": epvs.readOneEmployee();break;
                case "4": epvs.modifyEmployee();break;
                case "5": epvs.removeEmployee();break;
                case "0": System.exit(0); break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }

        }
    }
}
