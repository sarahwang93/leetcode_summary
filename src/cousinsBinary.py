class Solution:
    def isCousins(self, root:TreeNode, x:int, y:int) -> bool:
        if root is None:
            return False
        q = [(-1, root)] #(parent, node)
        while(len(q)>0):
            n = len(q)
            hs = {}

            for _ in range(n):
                parent, node =  q.pop(0)
                hs[node.val] = parent
                if node.left != None:
                    q.append(node.val, node.left)
                if node.right != None:
                    q.append(node.val, node.right)

            if x in hs and y in hs:
                if hs[x] != hs[y]:
                    return True
                else:
                    return False
        return False
