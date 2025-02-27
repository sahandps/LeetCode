def findNumbers(nums):
    holder = 0

    for i in range(len(nums)):
        number = str(nums[i])
        if len(number) % 2 == 0:
            holder += 1
    return holder        