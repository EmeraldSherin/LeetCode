class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if(!isvowels(arr[l])){
                l++;
            }else if(!isvowels(arr[r])){
                r--;
            }else{
                char temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
        return new String(arr);
    }
    public boolean isvowels(char ch){
        return "aeiouAEIOU".indexOf(ch)!=-1;
    }
}