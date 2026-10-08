import java.util.*;

class Solution {

    public boolean isAnagram(String str1, String str2) {

        // Lengths must be equal
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters of str1
        for (int i = 0; i < str1.length(); i++) {

            char ch = str1.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Decrease characters using str2
        for (int i = 0; i < str2.length(); i++) {

            char ch = str2.charAt(i);

            if (!map.containsKey(ch)) {
                return false;
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) < 0) {
                return false;
            }
        }

        return true;
    }
}