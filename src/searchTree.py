# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class searchTree:
    def searchBST(self, root: TreeNode, val: int) -> TreeNode:
        #corner case
        res = []
        if root == None:
            return res

        node = root
        while node!=None:
            if val<node.val:
                node = node.left
            elif val>node.val:
                node = node.right
            else:
                return node