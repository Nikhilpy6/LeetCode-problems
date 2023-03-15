/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sorting(List<Integer> list){
        int swaps = 0;
        int[] sorted = new int[list.size()];
        for(int i=0; i<sorted.length; i++) sorted[i] = list.get(i);
        Arrays.sort(sorted);
        Map<Integer, Integer> ind = new HashMap<>();
        for(int i=0; i<list.size(); i++) ind.put(list.get(i), i);
        
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) != sorted[i]) {
                swaps++;
                ind.put(list.get(i), ind.get(sorted[i]));
                list.set(ind.get(sorted[i]), list.get(i));
            }
        }
        return swaps;
    }
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        int ans=0;
        while(!qu.isEmpty()){
            int s=qu.size();
            List<Integer> list =new ArrayList<>();
            while(s-- >0){
                TreeNode cur=qu.poll();
                if(cur.left != null){
                    qu.offer(cur.left);
                    list.add(cur.left.val);
                }
                if(cur.right != null){
                    qu.offer(cur.right);
                    list.add(cur.right.val);
                }
            }
            ans+=sorting(list);
        }
        return ans;
    }
}