import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
        int n = sequence.length;
        int sum = 0, end = 0;
        int interval = n;
        int[] res = new int[2];

        for (int start = 0; start < n; start++) {
            while (sum < k && end < n) {
                sum += sequence[end++];
            }
            if (sum == k && end - 1 - start < interval) {
                res = new int[]{start, end - 1};
                interval = end - 1 - start;
            }
            sum -= sequence[start];
        }

        return res;
    }
}