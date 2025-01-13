def sortArrayByParity(nums: List[int]) -> List[int]:
    for i in range(len(nums)):
        if nums[i] % 2 == 0:
            nums.insert(0, nums.pop(i))