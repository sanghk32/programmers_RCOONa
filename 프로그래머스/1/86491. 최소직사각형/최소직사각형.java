class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_x = 0;
        int min_y = 0;
        for(int i=0; i<sizes.length; i++){
            int x = Math.max(sizes[i][0],sizes[i][1]);
            int y = Math.min(sizes[i][0],sizes[i][1]); 
            max_x = Math.max(x,max_x);
            min_y = Math.max(y,min_y);
            
        }
        answer = (max_x * min_y);
        
        return answer;
    }
}