import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        
        generate("", 0, 0, n, result);
        
        return result;
    }

    void generate(String current, int open, int close, int n, List<String> result) {
        
        // Valid complete combination
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // Add '(' if we still have opening brackets
        if (open < n) {
            generate(current + "(", open + 1, close, n, result);
        }

        // Add ')' only if it won't make brackets invalid
        if (close < open) {
            generate(current + ")", open, close + 1, n, result);
        }
    }
}