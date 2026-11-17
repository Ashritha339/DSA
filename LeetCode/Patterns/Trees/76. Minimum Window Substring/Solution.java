import java.util.*;

class Solution {

    public String minWindow(String s, String t) {

        // Store frequency of characters in t
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int right = 0;

        // Number of characters still needed
        int count = t.length();

        int minLen = Integer.MAX_VALUE;
        int start = -1;

        while (right < s.length()) {

            char ch = s.charAt(right);

            // If current character is still needed
            if (map.containsKey(ch) && map.get(ch) > 0) {
                count--;
            }

            // Decrease its frequency
            map.put(ch, map.getOrDefault(ch, 0) - 1);

            // Window is valid
            while (count == 0) {

                // Update answer
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                // Increase frequency while removing
                map.put(leftChar, map.getOrDefault(leftChar, 0) + 1);

                // Window becomes invalid
                if (map.get(leftChar) > 0) {
                    count++;
                }

                left++;
            }

            right++;
        }

        return start == -1 ? "" : s.substring(start, start + minLen);
    }
}