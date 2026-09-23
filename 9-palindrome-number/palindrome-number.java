class Solution {
    public boolean isPalindrome(int x) {
        int dup=x;
        int rev=0;
        if(x<0){
            return false;
        }
        while(dup!=0){
            int temp=dup%10;
            rev=rev*10+temp;
            dup=dup/10;
        }
        return rev==x;
    }
}