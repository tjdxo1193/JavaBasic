package ProgrammersProblem;

import java.util.Arrays;

/***
 * 문제 설명
 * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
 *
 * 예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
 *
 * array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
 * 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
 * 2에서 나온 배열의 3번째 숫자는 5입니다.
 * 배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
 * commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에
 * 담아 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * array의 길이는 1 이상 100 이하입니다.
 * array의 각 원소는 1 이상 100 이하입니다.
 * commands의 길이는 1 이상 50 이하입니다.
 * commands의 각 원소는 길이가 3입니다.
 *
 *
 *
 */
public class KNum {
    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = {};

            answer = new int[commands.length];
            int i,j,k;
            int uniuCommands[] = null;

            for(int n = 0; n < commands.length ; n++){
                i = 0;
                j = 0;
                k = 0;

                uniuCommands = commands[n].clone();

                //System.out.println("unitCommands : " + Arrays.toString(uniuCommands));

                i = uniuCommands[0];
                j = uniuCommands[1];
                k = uniuCommands[2];

                int[] ij_array = new int[j-i+1];

                for (int m = 0; m < j-i+1 ; m++){
                    ij_array[m] = array[i-1+m];
                }
                //System.out.println("ij_array : " + Arrays.toString(ij_array));
                Arrays.sort(ij_array);
                //System.out.println("sorted tempArray : " + Arrays.toString(ij_array));
                answer[n] = ij_array[k-1];


            }

            return answer;



        }
    }

}