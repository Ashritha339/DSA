class Solution {
    public String convert(String str, int n) {
        if (n == 1 || n >= str.length()) {
            return str;
        }

        char mat[][] = new char[n][str.length()];

        int s = 0;
        int col = 0;
        int r = n - 2;
        boolean dir = true;

        while (s < str.length()) {
            if (dir == true) {
                for (int i = 0; i < n && s < str.length(); i++) {
                    mat[i][col] = str.charAt(s);
                    s++;
                }
                col++;
                r = n - 2;
                dir = false;
            } else {
                while (r > 0 && s < str.length()) {
                    mat[r][col] = str.charAt(s);
                    s++;
                    r--;
                    col++;
                }
                dir = true;
            }
        }

        String ans = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (mat[i][j] != '\0') {
                    ans += mat[i][j];
                }
            }
        }

        return ans;
    }
}