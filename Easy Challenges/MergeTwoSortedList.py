class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def mergeTwoLists(list1, list2):
    newNode = ListNode()
    end = newNode


    while list1 and list2:
        if list1 < list2:
            end.next = list1
            list1 = list1.next
        else:
            end.next = list2
            list2 = list2.next
        end = end.next
    if list1:
        end.next = list1
    elif list2:
        end.next = list2
    return end.next    


        