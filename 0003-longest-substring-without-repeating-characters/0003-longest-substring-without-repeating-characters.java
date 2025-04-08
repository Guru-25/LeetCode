class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        int left=0;
        int right=0;
        int n=s.length();
        int maxi=0;
        while(right<n){
            if(hm.containsKey(s.charAt(right))){
                left=Math.max(hm.get(s.charAt(right))+1,left);
            }
            hm.put(s.charAt(right),right);
            maxi=Math.max(maxi,right-left+1);
            right++;
        }
        return maxi;
    }
}