def thirdMax(nums: List[int]) -> int:
    if len(nums) == 1:
        return nums[0]
    elif len(nums) == 2:
        return max(nums)
    
    sor = []
    for x in nums:
        if x not in sor:
            sor.append(x)
    
    sor.sort(reverse=True)
    
    if len(sor) >= 3:
        return sor[2]  
    else:
        return sor[0]  

            
