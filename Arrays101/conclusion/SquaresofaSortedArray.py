def sortedSquares(nums):
    for x in range(len(nums)-1):
        nums[x] = nums[x] * nums[x]
        
    nums.sort()
    return nums


test = [-4,-1,0,3,10]
sortedSquares(test)