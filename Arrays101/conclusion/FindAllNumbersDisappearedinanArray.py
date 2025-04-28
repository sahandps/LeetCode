def findDisappearedNumbers(nums):
    for number in nums:
        index = abs(number) - 1
        if nums[index] > 0:
            nums[index] *= -1
    missing_numbers = []
    for i in range(len(nums)):
        if nums[i] > 0:
            missing_numbers.append(i + 1)
    return missing_numbers


test = [4,3,2,7,8,2,3,1]

findDisappearedNumbers(test)