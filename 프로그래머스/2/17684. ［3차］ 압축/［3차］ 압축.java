import java.util.*;
class Solution {
    public int[] solution(String msg) {
        List<Map<String,Integer>> dict = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int[] answer = {};
        //리스트에 숫자로 Z까지 저장해놓기  
        //리스트의 마지막에 추가한다. 
        //근데 추가를 일케하면 안대넹 
        // 추가를 Map 으로 <문자,숫자> 이렇게 저장해야할듯 여기서 숫자는 리스트 길이 
        
        

        Map<String, Integer> map = new HashMap<>();
        int count = 1;
        
        //입력 5개면 길이 5 0번째부터 시작 
        for (int i = 'A'; i <= 'Z'; i++) {
            map.put(String.valueOf((char) i), count++);
        }
        
        
//         for(int i=0; i<msg.length(); i++){
//             char c = msg.charAt(i);
            
//             answer = new int[]{map.get(String.valueOf(c))};
//             // 다음 글자가 있으면 두 글자 조합 시도
//             if (i + 1 < msg.length()) {
//                 String combined = msg.substring(i, i + 2); // "KA", "AK" ...
//                 if (map.containsKey(combined)) {
//                 // combined이 map에 있으면 처리
                    
//                 }
        //러어러러러 이러면 안되네 while 문 써야되네 ㄹㄹㄹㄹㄹㄴㄹ
//             }
//         }
        int i = 0; 
        while(i<msg.length()){
            //현재문자 가져오기
            String cur = String.valueOf(msg.charAt(i));
            //현재문자에 다음문자 잇으면 합체 
            while(i+1<msg.length()){
                String next = cur + msg.charAt(i + 1);
                //만약에 맵에 잇으면 i늘리구 합친ㄱ 현재값으로 두기  
                if(map.containsKey(next)){
                    i++;
                    cur = next;
                }else{
                    break;
                }
                
            }
            // 1. 먼저 현재 current 값 answer에 추가
            list.add(map.get(cur));

            // 2. 그 다음 새 문자열 등록
            if (i + 1 < msg.length()) {
                map.put(cur + msg.charAt(i + 1), map.size() + 1);
            }    
            i++;
        }
        
        answer = new int[list.size()];
        
        
        for(int j=0; j<list.size(); j++){
           answer[j] = list.get(j); 
        }
        //현재문자가 리스트안에 있고, 그다음문자랑 합친 문자열이 리스트에 없으면 
        
        
        return answer;
    }
}