package ProgrammersProblem;

import java.util.Scanner;

class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int _new = -1;
        int _newnew = N;
        int cnt = 0;
        while(N != _new) {
            _new = (_newnew - _newnew%10)/10 + _newnew%10;
            _newnew = (_newnew%10)*10 + _new%10;
            _new = _newnew;
            cnt++;
        }
        System.out.println(cnt);
    }
}
