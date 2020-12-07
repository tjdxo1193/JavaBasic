package ProgrammersProblem;

public class Block {
    public static int[] robot_xy1 = {0, 0};
    public static int[] robot_xy2 = {0, 1};
    public static int[] robot_a = {5, 5};
    public static boolean flag = true;

    public int solution(int[][] board) {
        int answer = 0;
        int[] robot_a = {5, 5};
        int N = board.length - 1;
        boolean flag = true;


        while (board[board.length - 1][board.length - 1] == 5) {


        }


        return answer;

    }

    public static int[][] Move_right(int[][] board) {
        int[] xy1 = {0, 0};
        int[] xy2 = {0, 1};
        int f = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 5) {
                    if (xy1[0] != 0) {
                        xy2[0] = i;
                        xy2[1] = j;
                        break;
                    }
                    xy1[0] = i;
                    xy1[1] = j;
                }
            }
        }
        // 005500 -> 000550, 005510 -> x
        if ((board[xy1[0] + 1][xy1[1]] != 1) && (board[xy2[0] + 1][xy2[1]] != 1)) {
            board[xy1[0]][xy1[1]] = 0;
            board[xy2[0]][xy2[1]] = 0;
            board[xy1[0] + 1][xy1[1]] = 5;
            board[xy2[0] + 1][xy2[1]] = 5;
        } else {
            System.out.println("오른쪽길이 막혔습니다.");
            flag = false;
            return board;
        }
        return board;
    }

    public int[][] Move_left(int[][] board) {
        int[] xy1 = {0, 0};
        int[] xy2 = {0, 1};
        int f = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 5) {
                    if (xy1[0] != 0) {
                        xy2[0] = i;
                        xy2[1] = j;
                        break;
                    }
                    xy1[0] = i;
                    xy1[1] = j;
                }
            }
        }

        if ((board[xy1[0] - 1][xy1[1]] != 1) && (board[xy2[0] - 1][xy2[1]] != 1)) {
            board[xy1[0]][xy1[1]] = 0;
            board[xy2[0]][xy2[1]] = 0;
            board[xy1[0] - 1][xy1[1]] = 5;
            board[xy2[0] - 1][xy2[1]] = 5;
        } else {
            System.out.println("왼쪽길이 막혔습니다.");
            flag = false;
            return board;
        }
        return board;
    }

    public int[][] Move_up(int[][] board) {
        int[] xy1 = {0, 0};
        int[] xy2 = {0, 1};
        int f = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 5) {
                    if (xy1[0] != 0) {
                        xy2[0] = i;
                        xy2[1] = j;
                        break;
                    }
                    xy1[0] = i;
                    xy1[1] = j;
                }
            }
        }

        if ((board[xy1[0]][xy1[1] - 1] != 1) && (board[xy2[0] + 1][xy2[1] - 1] != 1)) {
            board[xy1[0]][xy1[1]] = 0;
            board[xy2[0]][xy2[1]] = 0;
            board[xy1[0] + 1][xy1[1] - 1] = 5;
            board[xy2[0] + 1][xy2[1] - 1] = 5;
        } else {
            System.out.println("위쪽길이 막혔습니다.");
            flag = false;
            return board;
        }
        return board;
    }

    public int[][] Move_down(int[][] board) {
        int[] xy1 = {0, 0};
        int[] xy2 = {0, 1};
        int f = 0;
        int[][] result;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 5) {
                    if (xy1[0] != 0) {
                        xy2[0] = i;
                        xy2[1] = j;
                        break;
                    }
                    xy1[0] = i;
                    xy1[1] = j;
                }
            }
        }

        if ((board[xy1[0]][xy1[1] + 1] != 1) && (board[xy2[0]][xy2[1] + 1] != 1)) {
            board[xy1[0]][xy1[1]] = 0;
            board[xy2[0]][xy2[1]] = 0;
            board[xy1[0]][xy1[1] + 1] = 5;
            board[xy2[0]][xy2[1] + 1] = 5;
        } else {
            System.out.println("아래쪽길이 막혔습니다.");
            flag = false;
            return board;
        }
        return board;
    }

    public int[][] turn_dRight(int[][] board){
        int[] xy1 = {0, 0};
        int[] xy2 = {0, 1};
        int f = 0;
        int[][] result;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 5) {
                    if (xy1[0] != 0) {
                        xy2[0] = i;
                        xy2[1] = j;
                        break;
                    }
                    xy1[0] = i;
                    xy1[1] = j;
                }
            }
        }

        if ((board[xy1[0]][xy1[1] + 1] != 1) && (board[xy2[0]][xy2[1] + 1] != 1)) {
            board[xy1[0]][xy1[1]] = 0;
            board[xy1[0] + 1 ][xy1[1] + 1] = 5;
        } else {
            System.out.println("아래쪽길이 막혔습니다.");
            flag = false;
            return board;
        }
        return board;
    }

    public int[][] turn_dleft(int[][] board){
        int[] xy1 = {0, 0};
        int[] xy2 = {0, 1};
        int f = 0;
        int[][] result;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 5) {
                    if (xy1[0] != 0) {
                        xy2[0] = i;
                        xy2[1] = j;
                        break;
                    }
                    xy1[0] = i;
                    xy1[1] = j;
                }
            }
        }

        if ((board[xy1[0]][xy1[1] + 1] != 1) && (board[xy2[0]][xy2[1] + 1] != 1)) {
            board[xy2[0]][xy2[1]] = 0;
            board[xy2[0] + 1 ][xy2[1] - 1] = 5;
        } else {
            System.out.println("장애물이 있습니다.");
            flag = false;
            return board;
        }
        return board;
    }

    public int[][] turn_uRight(int[][] board){
        int[] xy1 = {0, 0};
        int[] xy2 = {0, 1};
        int f = 0;
        int[][] result;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 5) {
                    if (xy1[0] != 0) {
                        xy2[0] = i;
                        xy2[1] = j;
                        break;
                    }
                    xy1[0] = i;
                    xy1[1] = j;
                }
            }
        }

        if ((board[xy1[0]][xy1[1] + 1] != 1) && (board[xy2[0]][xy2[1] + 1] != 1)) {
            board[xy1[0]][xy1[1]] = 0;
            board[xy2[0]][xy2[1]] = 0;
            board[xy1[0]][xy1[1] + 1] = 5;
            board[xy2[0]][xy2[1] + 1] = 5;
        } else {
            System.out.println("아래쪽길이 막혔습니다.");
            flag = false;
            return board;
        }
        return board;
    }

    public int[][] turn_uleft(int[][] board){
        int[] xy1 = {0, 0};
        int[] xy2 = {0, 1};
        int f = 0;
        int[][] result;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 5) {
                    if (xy1[0] != 0) {
                        xy2[0] = i;
                        xy2[1] = j;
                        break;
                    }
                    xy1[0] = i;
                    xy1[1] = j;
                }
            }
        }

        if ((board[xy1[0]][xy1[1] + 1] != 1) && (board[xy2[0]][xy2[1] + 1] != 1)) {
            board[xy1[0]][xy1[1]] = 0;
            board[xy2[0]][xy2[1]] = 0;
            board[xy1[0]][xy1[1] + 1] = 5;
            board[xy2[0]][xy2[1] + 1] = 5;
        } else {
            System.out.println("아래쪽길이 막혔습니다.");
            flag = false;
            return board;
        }
        return board;
    }

}