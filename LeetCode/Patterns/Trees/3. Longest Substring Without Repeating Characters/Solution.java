import java.util.*;

class Solution {

    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> table = new HashMap<>();

        int l = 0;
        int maxLen = 0;

        for (int r = 0; r < s.length(); r++) {

            char ch = s.charAt(r);

            // If character is already present in the current window
            if (table.containsKey(ch) && table.get(ch) >= l) {
                l = table.get(ch) + 1;
            }

            // Store/update the latest index
            table.put(ch, r);

            // Update maximum length
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}

