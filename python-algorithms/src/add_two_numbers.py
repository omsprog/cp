from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

# Input: l1 = [2,4,3], l2 = [5,6,4]
# Output: [7,0,8]

class AddTwoNumbers:
    def listToNode(self, lst):
        head = ListNode(lst[0])
        current = head
        
        for value in lst[1:]:
            current.next = ListNode(value)
            current = current.next
    
        return head

    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        resuls = []
        carry = False

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
            
            resuls.append(sum)
            
            if(l1 is not None):
                l1 = l1.next
            if(l2 is not None):
                l2 = l2.next

        if(carry):
            resuls.append(1)

        return self.listToNode(resuls)