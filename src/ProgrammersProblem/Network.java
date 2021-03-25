package ProgrammersProblem;

public class Network {

        public int solution(int n, int[][] computers) {
            int answer = 0;
            int visited[] = new int[n];
            for (int i = 0; i < n ; i++){
                if (visited[i] == 1)
                answer++;
                visited[i] = 1;

                dfs(i,n,visited,computers);
            }

            return answer;
        }

        private void dfs(int from, int n, int[] visited, int[][] computers) {
            for (int j = 0; j < n;j++){
                if (from != j && computers[from][j] == 1 && visited[j] != 1){
                    visited[j] = 1;
                    dfs(j,n,visited,computers);
                }
            }

        }


}
