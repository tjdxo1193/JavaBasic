package lab;
//가. 사용자로부터 복권 숫자 3자리를 입력 받으세요 (yourkey)
//
// 나. 변수에 임의의 복권 숫자 3자리를 초기화합니다 (lottokey)
//
// 다. 사용자가 입력한 복권 숫자가 모두 일치 : 상금 1백만 지급
//
// 라. 일치하지 않는 경우 : “아쉽지만, 다음 기회를!” 라고 출력
//

import java.util.Random;
import java.util.Scanner;

public class Q25_Lotto{

    public static void main(String[] args) {

        int[] yourkey = new int[3];
        int[] lottokey = new int[3];

        Scanner sc  = new Scanner(System.in);
        //사용자 키 입력
        System.out.println("복권 번호 3개를 입력 하시오 : ");
        for(int i = 0; i < yourkey.length; i++){
           yourkey[i] = sc.nextInt();
        }
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        //로또 키 초기화
        for (int i = 0; i < 3; i++) {
            lottokey[i] = random.nextInt(45)+1;
            for(int j=0; j < i; j++) {
                if(lottokey[i] == lottokey[j])
                    i--;
            }
        }
        //일치하는 지, 안하는지 , 일치하면 카운트 ++
        int cnt = 0;
        for(int i = 0; i < yourkey.length; i++) {
            for (int j = 0; j < yourkey.length; j++) {
                if (yourkey[i] == lottokey[j]) {
                    cnt++;
                }

            }
        }
        //모두 일치와 그렇지 않으면 상금, 다음 기회 출력
        if(cnt == 3){
            System.out.println("상금 1백만 지급!!");
        }else
            System.out.println("아쉽지만, 다음 기회를!");

    }

}
