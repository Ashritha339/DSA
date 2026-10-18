
class Solution {

    public String frequencySort(String s) {

        // Store frequency of each character
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }


        // Store unique characters
        List<Character> chars = new ArrayList<>(map.keySet());


        // Sort characters according to frequency
        Collections.sort(chars, (a, b) -> {
            return map.get(b) - map.get(a);
        });


        // Build answer string
        StringBuilder ans = new StringBuilder();

        for (char ch : chars) {

            int count = map.get(ch);

            // Append character according to its frequency
            for (int i = 0; i < count; i++) {
                ans.append(ch);
            }
        }


        return ans.toString();
    }
}


