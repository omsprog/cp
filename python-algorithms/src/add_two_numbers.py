from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

# Input: l1 = [2,4,3], l2 = [5,6,4]
# Output: [7,0,8]

class AddTwoNumbers:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        carry = False
        head = ListNode(10) # Dummy node to keep a reference to the First element of the LL, value does not matter
        currentNode = head

        # for index in range(0, len(longerList)):
        while l1 is not None or l2 is not None:
            currentA = 0
            currentB = 0

            if(l1 is not None):
                currentA = l1.val
            if(l2 is not None):
                currentB = l2.val

            sum = currentA + currentB
            
            if(carry):
                sum += 1
                carry = False

            if(sum > 9):
                carry = True
                sum -= 10
            
            currentNode.next = ListNode(sum)
            currentNode = currentNode.next
            
            if(l1 is not None):
                l1 = l1.next
            if(l2 is not None):
                l2 = l2.next

        if(carry):
            currentNode.next = ListNode(1)
            currentNode = currentNode.next

        return head.next