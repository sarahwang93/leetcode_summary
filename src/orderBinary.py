from typing import List


class TreeNode:
     def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right


def verticalTraversal(self, root: TreeNode) -> List[List[int]]:
    def dfs(root, lst, x, y):
        if not root:
            return
        lst.append((x, y, root.val))
        dfs(root.left,lst,x-1, y+1)
        dfs(root.right,lst,x+1, y+1)


    if not root:
        return []
    lst = []
    dfs(root,lst,0, 0)
    lst.sort()
    res = []
    pre_x = None
    for x, y, n in lst:
        #the first element of each list idicate the level
        if x!=pre_x:
            res.append([n])
        else:
            res[-1].append(n)
        pre_x = x
    return res