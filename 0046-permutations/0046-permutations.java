import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutations(new ArrayList<>(), nums, result);
        return result;
    }

    private void permutations(List<Integer> p, int[] up, List<List<Integer>> result) {
        if (p.size() == up.length) {
            result.add(new ArrayList<>(p));
            return;
        }

        for (int i = 0; i < up.length; i++) {
            if (p.contains(up[i])) continue; // Skip used numbers
            p.add(up[i]);
            permutations(p, up, result);
            p.remove(p.size() - 1); // backtrack
        }
    }
}
