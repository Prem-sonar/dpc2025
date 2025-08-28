import java.util.*;

public class day14 {

    // Helper: Count substrings with at most k distinct characters
    private static int atMostK(String s, int k) {
        int n = s.length();
        Map<Character, Integer> freq = new HashMap<>();
        int left = 0, count = 0;

        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            // shrink window if distinct chars exceed k
            while (freq.size() > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                left++;
            }

            // number of substrings ending at right
            count += (right - left + 1);
        }

        return count;
    }

    // Main function: Count substrings with exactly k distinct characters
    public static int substrCount(String s, int k) {
        if (k == 0) return 0;
        return atMostK(s, k) - atMostK(s, k - 1);
    }

    // Driver method
    public static void main(String[] args) {
        String s = "pqpqs";
        int k = 2;
        System.out.println("Count = " + substrCount(s, k));
    }
}
