package ProgrammersProblem;

public class Stack {
        protected int top;
        protected char [] stack;
        protected int size;

        public Stack(int size) {
            this.size = size; //
            stack = new char[size];
            top = -1; // top 의 값 초기화
        }

        public void push(char item) {
            stack[++top] = item;
           // System.out.println(stack[top]);
        }

        public void peek() {
            //System.out.println(stack[top]);
        }

        public char pop() {
            char p =stack[top];
            stack[top--] = 0;
            return p;
        }

        public int search(char item) {
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


