class Solution {
    public void recur(int[] candidates, List<List<Integer>> ans, int idx, int target, List<Integer> storage){
        if(idx==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(storage));
            }
            return;
        }
        if(candidates[idx]<=target){
            storage.add(candidates[idx]);
            recur(candidates, ans, idx, target-candidates[idx],storage);
            storage.remove(storage.size()-1);
        }
        recur(candidates, ans, idx+1, target, storage);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        recur(candidates, ans, 0, target, new ArrayList<>());
        return ans;
    }
}