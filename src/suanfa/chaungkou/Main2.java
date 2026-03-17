package suanfa.chaungkou;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        String s="abcabcbb";
        int ans=lengthOfLongestSubstring(s);
        System.out.println(ans);
    }
    public static int lengthOfLongestSubstring(String s) {

        Map<Character,Integer> map=new HashMap<>();
        int left=0;
        int maxlen=1;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>1){
                char c2=s.charAt(left);
                map.put(c2,map.get(c2)-1);
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
        }
}
