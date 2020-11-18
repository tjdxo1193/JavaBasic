package lab;


import java.util.Random;
import java.util.Scanner;

//30. 다음 조건에 따라 숫자 맞추기 프로그램을 작성해보세요. (CatchNumber)
//
//        가. 사용자로부터 100 - 999사이의 숫자를 입력 받으세요 (num1)
//
//        나. 변수에 임의의 숫자 3자리를 초기화합니다 (num2)
//
//        다.  num1이 num2보다 크면 “추측한 숫자가 큽니다”라고 출력하세요
//
//        라.  num1이 num2보다 작으면 “추측한 숫자가 작습니다”라고 출력하세요
//
//        마.  num1과 num2가 같으면 “빙고! 숫자를 맞췄습니다”라고 출력하고 종료
public class Q30_CatchNum {
    public static int KEY;
    public static void main(String[] args) {


        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        KEY = random.nextInt(900)+100;
        CatchNumber();
    }
    public static void CatchNumber(){
        int key;
        boolean right = true;
        Scanner sc = new Scanner(System.in);
        while (right) {
            System.out.println("숫자를 입력하세요(100-999) : ");
            key = sc.nextInt();
            if(key == KEY){
                System.out.println("빙고! 숫자를 맞췄습니다.");
                break;
            }else if(key > KEY)
                System.out.println("추측한 숫자가 큽니다.");
            else  if(key < KEY)
                System.out.println("추측한 숫자가 작습니다.");
        }

    }

}
