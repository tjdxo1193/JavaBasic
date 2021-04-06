package ProgrammersProblem;

//X가 3으로 나누어 떨어지면, 3으로 나눈다.
//X가 2로 나누어 떨어지면, 2로 나눈다.
//1을 뺀다.
//
//정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다.
// 연산을 사용하는 횟수의 최솟값을 출력하시오.
import java.util.Scanner;
public class tobe_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[1000001];
        arr[1] = 0;
        for(int i = 2; i <= input; i++) {
            arr[i] = arr[i-1] + 1;
            if (i % 2 == 0) arr[i] = min(arr[i], arr[i/2] + 1);
            if (i % 3 == 0) arr[i] = min(arr[i], arr[i/3] + 1);
        }
        System.out.println(arr[input]);
    }


    public static int min(int a, int b) {
        return a > b ? b : a;
    }
}
