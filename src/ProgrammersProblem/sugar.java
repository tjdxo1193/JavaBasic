package ProgrammersProblem;

//n / 5 = 최소 (올림)
//~ n-3 / 5 = 최소 + 1
//~ n-3*2 / 5 = 최소 + 2
//~ n-3*3 / 5 = 최소 + 3
//~ n-3*4 / 5 = 최소 + 4
//~ n-3*5 / 5 = 최소 + 5
//n / 3 = 최대 (버림)
import java.util.Scanner;
public class sugar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int five_bag = 0;
        int three_bag = 0;
        int answer = 0;
        int max = input / 3 ;
        while (true){
            if (max < answer){
                answer = -1;
                break;
            }
            if (((input - 3*answer)%5.0)==0){
                three_bag = answer;
                five_bag = (input - 3*answer)/5;
                answer = three_bag + five_bag;
                break;
            }
            answer++;
        }
        System.out.println(answer);

    }
}
