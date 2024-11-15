from src.add_two_numbers import AddTwoNumbers
from src.add_two_numbers import ListNode

def test_addTwoNumbers():
    aTN = AddTwoNumbers()

    l1 = ListNode(2, ListNode(4, ListNode(3, None)))
    l2 = ListNode(5, ListNode(6, ListNode(4, None)))
    listNode = aTN.addTwoNumbers(l1, l2) # == [7,0,8]
    while(listNode is not None):
        print(listNode.val)
        listNode = listNode.next