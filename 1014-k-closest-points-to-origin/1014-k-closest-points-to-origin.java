class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
        //     return (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]);
        // });
        // for(int[] point:points){
        //     pq.add(point);
        //     if(pq.size()>k){
        //         pq.poll();
        //     }
        // }
        // int[][] res=new int[k][2];
        // for(int i=0;i<k;i++){
        //     res[i]=pq.poll();
        // }
        // return res;

        // Min-heap based on distance from origin
    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
        return (a[0]*a[0] + a[1]*a[1]) - (b[0]*b[0] + b[1]*b[1]);
    });

    for (int[] point : points)
        pq.add(point); // O(log n)

    int[][] res = new int[k][2];
    for (int i = 0; i < k; i++)
        res[i] = pq.poll(); // Closest point comes first

    return res;
    }
}