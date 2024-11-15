from src.add_two_numbers import AddTwoNumbers
from src.add_two_numbers import ListNode

def verifyNodeList(expectedList, listNode):
    index = 0
    while(listNode is not None):
        assert listNode.val == expectedList[index]
        index += 1
        listNode = listNode.next

def test_addTwoNumbers():
    aTN = AddTwoNumbers()
    
    #First 
    listNode = aTN.addTwoNumbers(
        ListNode(2, ListNode(4, ListNode(3, None))),
        ListNode(5, ListNode(6, ListNode(4, None)))
    )
    verifyNodeList([7,0,8], listNode)

    # Second
    listNode = aTN.addTwoNumbers(
        ListNode(0, None),
        ListNode(0, None)
    ) 
    verifyNodeList([0], listNode)
    
    # Third
    listNode = aTN.addTwoNumbers(
        ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, None))))))),
        ListNode(9, ListNode(9, ListNode(9, ListNode(9, None))))
    ) 
    verifyNodeList([8,9,9,9,0,0,0,1], listNode)