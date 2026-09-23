class Solution {
    public int lengthOfLongestSubstring(String s) {
       int max=0;
       int[] charIndex=new int[128];
       int left=0;
       for(int right=0;right<s.length();right++){
         char current=s.charAt(right);
          left=(Math.max(left,charIndex[current]));
          charIndex[current]=right+1;

        max=Math.max(max,right-left+1);
       }
        return max;
    }
}