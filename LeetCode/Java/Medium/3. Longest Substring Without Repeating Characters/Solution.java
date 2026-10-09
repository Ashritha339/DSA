
import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;

        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> map=new HashMap<>();
            int count=0;

            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);

                if(map.containsKey(ch)){
                    break;
                }

                map.put(ch,1);
                count++;

                if(count>max){
                    max=count;
                }
            }
        }

        return max;
    }
}