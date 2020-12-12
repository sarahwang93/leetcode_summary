class sumLeaf:
    def sumLeaf(self, root:TreeNode) -> int:
        paths = []

        if not root:
            return 0

        def dfs(path, node, paths):
            if not root:
                return
            elif not node.left and not node.right:
                paths.append(path)
            else:
                if node.left:
                    dfs(path + [node.left.val], node.left, paths)
                if node.right:
                    dfs(path + [node.right.val], node.right, paths)

        dfs([root.val], root, paths)
        num = 0

        for path in paths:
            str_path = ''.join([str(x) for x in path])
            num += int(str_path, 2)

        return num

