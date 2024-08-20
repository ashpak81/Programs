package DSA.String;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String name = "abcabcbb";

        int maxLength = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < name.length(); right++) {
            while (set.contains(name.charAt(right))) {
                set.remove(name.charAt(left));
                left++;
            }
            set.add(name.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println("Length of the longest substring without repeating characters: " + maxLength);
    }
}
