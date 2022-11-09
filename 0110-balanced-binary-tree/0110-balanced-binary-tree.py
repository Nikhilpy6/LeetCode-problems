# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        def test(root):
            if not root: return [True, 0]
            
            left, right = test(root.left), test(root.right)
            
            height_dif = abs(left[1]-right[1])
            balanced = left[0] and right[0] and height_dif<=1 
            
            height_of_the_root = max(left[1], right[1])
            return [balanced, 1 + height_of_the_root] 
        return test(root)[0]