

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> que = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int line = Integer.parseInt(br.readLine());

        for (int i = 0; i < line; i++) {
            String input = br.readLine();
            String[] oh = input.split(" ");

            if (oh[0].equals("push")) {
                que.add(oh[1]);
            } else if (oh[0].equals("pop")) {
                sb.append(que.isEmpty() ? -1 : que.poll()).append("\n");
            } else if (oh[0].equals("size")) {
                sb.append(que.size()).append("\n");
            } else if (oh[0].equals("empty")) {
                sb.append(que.isEmpty() ? 1 : 0).append("\n");
            } else if (oh[0].equals("front")) {
                sb.append(que.isEmpty() ? -1 : que.peek()).append("\n");
            } else if (oh[0].equals("back")) {
                sb.append(que.isEmpty() ? -1 : que.get(que.size() - 1)).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
