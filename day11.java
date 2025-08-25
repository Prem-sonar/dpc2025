import java.util.*;

public class day11 {
    public static List<String> permuteUnique(String s) {
        List<String> result = new ArrayList<>();
        char[] chars = s.toCharArray();
        Arrays.sort(chars); // sort to handle duplicates
        boolean[] used = new boolean[chars.length];
        backtrack(chars, new StringBuilder(), used, result);
        return result;
    }

    private static void backtrack(char[] chars, StringBuilder path, boolean[] used, List<String> result) {
        if (path.length() == chars.length) {
            result.add(path.toString());
            return;
        }
        
        for (int i = 0; i < chars.length; i++) {
            // Skip already used characters
            if (used[i]) continue;
            // Skip duplicates (only if previous duplicate not used)
            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue;
            
            // Choose
            used[i] = true;
            path.append(chars[i]);
         
            backtrack(chars, path, used, result);
            
            // Undo choice (backtrack)
            path.deleteCharAt(path.length() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args) {
        String s = "abc"; 
        List<String> permutations = permuteUnique(s);
        
        System.out.println("Unique permutations of \"" + s + "\":");
        for (String p : permutations) {
            System.out.println(p);
        }
    }
}
