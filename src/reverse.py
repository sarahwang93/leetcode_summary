class reverse:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head

        curr = head
        pre = None

        #iterative
        while curr and curr.next:
            temp = curr.next
            #first, update the next of head to empty
            #second round, update the current node to previous one
            curr.next = pre
            pre = curr
            curr = temp

        curr.next = pre

        return curr