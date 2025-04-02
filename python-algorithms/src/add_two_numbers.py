from typing import Optional

from src.ListNode import ListNode

class AddTwoNumbers:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        head = None
        tail = None
        carry = False

        while not (l1 is None and l2 is None):
            a = 0
            b = 0

            if l1 is not None:
                a = l1.val
                l1 = l1.next
            if l2 is not None:
                b = l2.val
                l2 = l2.next

            sum = a + b
            
            if carry:
                sum += 1
                carry = False

            if sum > 9:
                carry = True
                sum -= 10

            new_node = ListNode(sum)

            if head is None:
                head = new_node
                tail = new_node
            else:
                tail.next = new_node
                tail = tail.next


        if carry:
            tail.next = ListNode(1)

        return head