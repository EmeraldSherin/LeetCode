class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
         freq=[-1]*128
         maxl=0
         left=0
         for right in range(len(s)):
            index=ord(s[right])
            left=max(left,freq[index])
            maxl=max(maxl,right-left+1)
            freq[index]=right+1

         return maxl