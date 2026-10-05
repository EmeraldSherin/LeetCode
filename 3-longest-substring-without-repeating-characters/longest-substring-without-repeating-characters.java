class Solution {
    public int lengthOfLongestSubstring(String s) {
      int[] freq=new int[128];
      int max=0;
      int left=0;
      for (int right=0;right<s.length();right++){
        left=Math.max(left,freq[s.charAt(right)]);
        max=Math.max(max,right-left+1);
        freq[s.charAt(right)]=right+1;
      }
      return max;
    }
}