class reverse_recursive:
    def reverseList(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head

        second = head.next
        reverse = self.reverseList(head.next)
        second.next = head
        head.next = None

        return reverse
