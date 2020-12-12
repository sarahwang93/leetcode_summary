class swapNodes:
    def swapNodes(self, head:ListNode) -> ListNode:
        if not head or not head.next:
            return head

        first = head.next
        second = head
        second.next = self.swapNodes(first.next)
        first.next = second

        return first