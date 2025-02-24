def findMaxConsecutiveOnes(nums):
    if len(nums) == 0:
        return 0

    counter = 0
    ones = 0

    for i in range(len(nums) + 1):
        if nums[i] == 1:
            ones += 1
        else:
            if ones > counter:
                counter = ones
                ones = 0    
    return counter                    


num = [1,1,0,1,1,1]
findMaxConsecutiveOnes(num)        