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
  public int getSum(TreeNode root, List<Integer> li)
{
	if(root==null)
	{
		return 0;
	}
	int ls = getSum(root.left,li);
	int rs = getSum(root.right,li);
	int ts = ls + root.val + rs;
	li.add(ts);  // Adding the sum of subtree in list 
	return ts;
}
public int maxProduct(TreeNode root) {
	long maxi = 0;
	List<Integer> li = new ArrayList<>();
	int sum = getSum(root,li);//total sum
	for(long n:li)    // Traversing in the list
	{
		long pro = (sum-n)*n;   // Calculating every possibility
		maxi = Math.max(pro,maxi); // Considering the possibility if it is greater than previous possibility.
	}
	return (int)(maxi%1000000007);
        
    }
}