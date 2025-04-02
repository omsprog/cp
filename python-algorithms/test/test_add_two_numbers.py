from src.add_two_numbers import AddTwoNumbers
from src.add_two_numbers import ListNode

def verify_node_list(expected_list, list_node):
    index = 0
    while list_node is not None:
        assert list_node.val == expected_list[index]
        index += 1
        list_node = list_node.next

def test_add_two_numbers():
    aTN = AddTwoNumbers()

    list_node = aTN.addTwoNumbers(
        ListNode(2, ListNode(4, ListNode(3, None))),
        ListNode(5, ListNode(6, ListNode(4, None)))
    )
    verify_node_list([7,0,8], list_node)

    list_node = aTN.addTwoNumbers(
        ListNode(0, None),
        ListNode(0, None)
    ) 
    verify_node_list([0], list_node)

    list_node = aTN.addTwoNumbers(
        ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, None))))))),
        ListNode(9, ListNode(9, ListNode(9, ListNode(9, None))))
    ) 
    verify_node_list([8,9,9,9,0,0,0,1], list_node)