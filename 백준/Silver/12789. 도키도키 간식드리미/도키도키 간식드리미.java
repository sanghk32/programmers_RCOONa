import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            q.offer(Integer.parseInt(st.nextToken()));
        }

        int count = 1; // 다음에 간식 먹을 번호

        // 1. 먼저 줄 서 있는 사람들(큐)을 기준으로 처리
        while (!q.isEmpty()) {
            if (q.peek() == count) {
                // 큐 맨 앞사람이 순서라면 통과
                q.poll();
                count++;
            } else if (!s.isEmpty() && s.peek() == count) {
                // 옆길(스택) 맨 앞사람이 순서라면 통과
                s.pop();
                count++;
            } else {
                // 둘 다 아니면 일단 옆길(스택)로 보냄
                s.push(q.poll());
            }
        }

        // 2. 큐가 다 비었으면, 옆길(스택)에 남은 사람들 확인
        while (!s.isEmpty()) {
            if (s.peek() == count) {
                s.pop();
                count++;
            } else {
                // 순서가 안 맞는 사람이 막고 있으면 실패
                break;
            }
        }

        // 3. 모든 사람(n명)이 순서대로 나갔는지 확인
        if (count > n) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}