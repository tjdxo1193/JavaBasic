package ProgrammersProblem;

/**
 * 문제 설명
 * 프로그래머스 팀에서는 기능 개선 작업을 수행 중입니다.
 * 각 기능은 진도가 100%일 때 서비스에 반영할 수 있습니다.
 *
 * 또, 각 기능의 개발속도는 모두 다르기 때문에 뒤에 있는 기능이 앞에 있는 기능보다 먼저 개발될 수 있고,
 * 이때 뒤에 있는 기능은 앞에 있는 기능이 배포될 때 함께 배포됩니다.
 *
 * 먼저 배포되어야 하는 순서대로 작업의 진도가 적힌 정수 배열 progresses와 각 작업의 개발 속도가
 * 적힌 정수 배열 speeds가 주어질 때 각 배포마다 몇 개의 기능이 배포되는지를 return 하도록 solution 함수를 완성하세요.
 *
 * 제한 사항
 * 작업의 개수(progresses, speeds배열의 길이)는 100개 이하입니다.
 * 작업 진도는 100 미만의 자연수입니다.
 * 작업 속도는 100 이하의 자연수입니다.
 * 배포는 하루에 한 번만 할 수 있으며, 하루의 끝에 이루어진다고 가정합니다.
 * 예를 들어 진도율이 95%인 작업의 개발 속도가 하루에 4%라면 배포는 2일 뒤에 이루어집니다.
 *
 *입출력 예
 *  progresses	    speeds	     return
 *
 * [93, 30, 55]	  [1, 30, 5]	 [2, 1]
 *
 * [95, 90, 99,  [1, 1, 1, 1    [1, 3, 2]
 * 99, 80, 99]     , 1, 1]
 *
 *
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 첫 번째 기능은 93% 완료되어 있고 하루에 1%씩 작업이 가능하므로 7일간 작업 후 배포가 가능합니다.
 * 두 번째 기능은 30%가 완료되어 있고 하루에 30%씩 작업이 가능하므로 3일간 작업 후 배포가 가능합니다.
 * 하지만 이전 첫 번째 기능이 아직 완성된 상태가 아니기 때문에 첫 번째 기능이 배포되는 7일째 배포됩니다.
 * 세 번째 기능은 55%가 완료되어 있고 하루에 5%씩 작업이 가능하므로 9일간 작업 후 배포가 가능합니다.
 *
 * 따라서 7일째에 2개의 기능, 9일째에 1개의 기능이 배포됩니다.
 *
 * 입출력 예 #2
 * 모든 기능이 하루에 1%씩 작업이 가능하므로, 작업이 끝나기까지 남은 일수는 각각 5일, 10일, 1일, 1일, 20일, 1일입니다.
 * 어떤 기능이 먼저 완성되었더라도 앞에 있는 모든 기능이 완성되지 않으면 배포가 불가능합니다.
 *
 * 따라서 5일째에 1개의 기능, 10일째에 3개의 기능, 20일째에 2개의 기능이 배포됩니다.
 */


public class FunDel {

    public static void main(String[] args) {
        int[] pro = {95, 90, 99, 99, 80, 99};
        int[] spe = {1, 1, 1, 1, 1, 1};
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        //변수들 선언
        int[] answer = new int[progresses.length];
        int[] proceed = new int[progresses.length];
        boolean isFinish = true;
        int flagFir= 0;
        boolean flag = false;
        int re_finish = 0;
        int re_index =0;
        //스택 두개 생성
        UserArrayStack arrstack_p = new UserArrayStack(progresses.length);
        UserArrayStack arrstack_s = new UserArrayStack(speeds.length);
        //스택에 값을 거꾸로 넣기
        for(int i =1; i <= progresses.length; i++){
            arrstack_p.push(progresses[progresses.length-i]);
            arrstack_s.push(speeds[speeds.length-i]);
        }
        //스택에 잘 들어 갔는지 점검
        if(arrstack_p.empty()){
            System.out.println("스택이 비었습니다. 프로그램, 논리적 오류!!");
        }
        //배열 초기화
        for (int i = 0; i <proceed.length; i++){
            proceed[i] = progresses[i];
            answer[i] = 0;
        }
        //데이터 처리구간
        while(!arrstack_p.empty()){
            while (flagFir < proceed.length) {
                if (proceed[flagFir] >= 100) {
                    arrstack_p.pop();
                    arrstack_s.pop();
                    flagFir++;
                    re_finish++;
                    flag = true;
                    if (flagFir == proceed.length)
                        break;
                    //System.out.println("수행중");
                } else {
                   // System.out.println("빠져나감");
                    break;
                }
            }
            if (flag) {//오늘 배포 가능한 기능수 답에 대입!
                answer[re_index++] = re_finish;
                flag = false;
            }
            if (flagFir == proceed.length)
                break;
            re_finish = 0; //오늘 배포 가능한 기능 수 => 초기화
            for (int i = flagFir; i < proceed.length; i++){//하루 치 update 하루가 끝나고 업데이트됨.
                proceed[i] = proceed[i] + speeds[i];
            }
        }
        int result[] = new int[re_index];
        for (int i = 0; i < re_index; i++ )
            result[i] = answer[i];
        return result;
    }

}

class UserArrayStack {

    int top;
    int [] stack;
    int size;

    public UserArrayStack(int size) {
        this.size = size; //
        stack = new int[size];
        top = -1; // top 의 값 초기화
    }

    public void push(int item) {
        stack[++top] = item;
       // System.out.println(stack[top] + " push!");
    }

    public void peek() {
       // System.out.println(stack[top] + " peek!");
    }

    public void pop() {
       // System.out.println(stack[top] + " pop!");
        stack[top--] = 0;
    }

    public int search(int item) {
        for (int i = 0; i <= top; i++) { // for 문은 top 만큼
            if (stack[i] == item)
                return (top - i) + 1; // top - 탐색한 배열의 인덱스, 배열 이므로 +1 추가
        }
        return -1;
    }

    public boolean empty() {
        return size == 0;
    }
}

