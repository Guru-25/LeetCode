class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        int[][] al=new int[intervals.length][2];
        int flag=0;
        al[0]=intervals[0];
        for(int i=1;i<intervals.length;i++){
            int curStart=intervals[i][0]; //2
            int curEnd=intervals[i][1];//3

            int prevStart=al[flag][0];//1
            int prevEnd=al[flag][1];//3
            if(curStart<=prevEnd){
                al[flag][1]=Math.max(prevEnd,curEnd);
            }else{
                flag++;
                al[flag]=intervals[i];
            }
        }
        return Arrays.copyOfRange(al, 0,flag+1);
    }
}