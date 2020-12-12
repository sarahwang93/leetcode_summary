class Solution:
    def getAllElements(self, root1: TreeNode, root2: TreeNode) -> List[int]:
        lst = []
        self.dfs(root1, lst)
        self.dfs(root2, lst)

        return sorted(lst)

    def dfs(self, root: TreeNode, tmplist: List):
        if root is None:
            return
        else:
            tmplist.append(root.val)

        self.dfs(root.left, tmplist)
        self.dfs(root.right, tmplist)