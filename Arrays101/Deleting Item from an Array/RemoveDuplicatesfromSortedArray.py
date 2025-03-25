from typing import List

def removeDuplicates(nums):
    i = 1
    holder = nums[0]

    while i < len(nums)-1:
        if nums[i] == holder:
            nums.pop(i)
        else:
            holder = nums[i]
            i += 1

        
    return nums            



test =[1, 1]
removeDuplicates(test)