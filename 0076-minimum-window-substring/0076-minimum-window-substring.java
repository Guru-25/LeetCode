class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(char ch:t.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }
        int l=0;
        int r=0;
        int count=0;
        int minlen=Integer.MAX_VALUE;
        int startIdx=-1;
        while(r<s.length()){
            char ch=s.charAt(r);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)-1);
                if(hm.get(ch)>=0){
                    count++;
                }
            }
            while(count==t.length()){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    startIdx=l;
                }
                char ch2=s.charAt(l);
                if(hm.containsKey(ch2)){
                    hm.put(ch2,hm.get(ch2)+1);
                    if(hm.get(ch2)>0){
                        count--;
                    }
                }
                l++;
            }
            r++;
        }
        if(startIdx!=-1){
            return s.substring(startIdx, startIdx+minlen);
        }
        return "";
    }
}