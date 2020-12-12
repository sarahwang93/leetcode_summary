class Solution:
    def invertTree(self, root: TreeNode) -> TreeNode:
        tmp = None
        node = root
        thislevel = [root]
        
        #breadth first search
        while(len(thislevel) > 0):
            nextlevel = list()
            for n in thislevel:
                if n!= None:
                    if n.left != None and n.right != None: 
                        tmp = n.left
                        n.left = n.right
                        n.right = tmp                        
                    elif n.right == None:
                        tmp = n.left
                        n.left = None
                        n.right = tmp
                    elif n.left == None:
                        tmp = n.right
                        n.right = None
                        n.left = tmp 
                    nextlevel.append(n.left)
                    nextlevel.append(n.right)
                    thislevel = nextlevel
            if len(nextlevel) == 0:
                break
            print(nextlevel)
        return node
         