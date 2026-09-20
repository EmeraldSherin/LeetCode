class Solution {
    public int reverseDegree(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int value = 26 - (ch - 'a'); 
            map.put(ch, value);
        }
        int sum=0;
        for(int i=0;i<s.length();i++){
            sum+=(map.get(s.charAt(i))*(i+1));
        }
        return sum;
    }
}