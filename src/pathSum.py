class Solution:
    def pathSum(root:TreeNode, sum) -> int:
        self.numOfPath = 0
        self.dfs(root, sum)
        return self.numOfPath

    def dfs(root:TreeNode, sum) -> None:
        if root is None:
            return
        self.test(root, sum)
        self.dfs(root.left, sum)
        self.dfs(root.right, sum)

    def test(root:TreeNode, sum) -> None:
        if root is None:
            return
        elif root.val == sum:
            self.numOfPath += 1

        self.test(root.left, sum-root.val)
        self.test(root.right, sum-root.val)