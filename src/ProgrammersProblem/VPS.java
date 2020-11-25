package ProgrammersProblem;

import java.util.Scanner;

public class VPS {

    public static void main(String[] args) {
        Vps();
    }

    public static void Vps() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.skip("\r\n|[\n\r]");

        String v[] = new String[T];
        String[] answer = new String[T];
        //char[][] chs = new char[T][];
        Stack st[] = new Stack[T];
        int cnt = 0;

        for (int a = 0; a < T; a++) {
            System.out.println("입력: ");
            v[a] = sc.next();
            char []chs = v[a].toCharArray();
            st[a].size = chs.length;


            for (int i = 0; i < chs.length; i++) {
                st[a].push(chs[i]);
            }//push로 값 집어 넣기

            int x = 0; // ) 의 갯수
            int y = 0; // ( 의 갯수

            for (int j = 0; j < st[a].stack.length; j++) {
                char key = st[a].pop();//하나씩 위에서 빼면서 검사
                if ((j == 0) && (key == '(')) {
                    answer[cnt++] = "No";
                    break;
                } else {
                    if (key == ')') {
                        x++;
                    } else
                        y++;
                }
                if ((j == st[a].stack.length - 1)) {
                    if (x == y)
                        answer[cnt++] = "Yes";
                    else
                        answer[cnt++] = "No";
                }
            }
        }

        for (int i = 0; i < T; i ++)
            System.out.println(answer[i]);
    }
}


