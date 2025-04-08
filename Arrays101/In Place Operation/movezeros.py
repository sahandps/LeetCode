def moveZeroes(nums):
    """
    Do not return anything, modify nums in-place instead.
    """
    insert_pos = 0

    for num in nums:
        if num != 0:
            nums[insert_pos] = num
            insert_pos += 1

    for i in range(insert_pos, len(nums)):
        nums[i] = 0

nums = [0,1,0]

moveZeroes(nums)