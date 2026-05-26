
class Solution {
    public int lengthOfLongestSubstring(String s) {

int maxLength = 0;

for (int i = 0; i < s.length(); i++) {

    boolean[] visited = new boolean[256]; // ASCII

    for (int j = i; j < s.length(); j++) {

        if (visited[s.charAt(j)]) {
            break; // duplicate found
        }

        visited[s.charAt(j)] = true;
        maxLength = Math.max(maxLength, j - i + 1);
    }
}

return maxLength;

    }
}