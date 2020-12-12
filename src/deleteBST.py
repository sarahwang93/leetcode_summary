class TreeNode:
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right
class deleteBST:
    def deleteNode(self, root: TreeNode, key: int) -> TreeNode:
        if not root:
            return root

        if root.val == key:
            if not root.right:
                root = root.left
            else:
                tmp = root.right
                while tmp.left:
                    tmp = tmp.left
                #replace the root node with the min node of right tree, then other nodes are all larger than this node
                root.val = tmp.val
                #delete the min node
                root.right = self.deleteNode(root.right, tmp.val)
        elif root.val > key:
            root.left = self.deleteNode(root.left, key)
        else:
            root.right = self.deleteNode(root.right, key)

        return root