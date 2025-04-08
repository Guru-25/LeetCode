class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] flag=new int[26];
        for(char ch:magazine.toCharArray()){
            flag[(int)ch-'a']++;
        }
        for(char ch:ransomNote.toCharArray()){
            if(flag[(int)ch-'a'] !=0){
                flag[(int)ch-'a']--;
            }else{
                return false;
            }
        }
        return true;
    }
}