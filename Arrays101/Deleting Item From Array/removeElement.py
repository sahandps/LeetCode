def removeElement(nums, val):
    # Initialize a pointer for the position of the next non-val element
    k = 0
    
    # Iterate through the array
    for i in range(len(nums)):
        # If the current element is not equal to val, place it at index k
        if nums[i] != val:
            nums[k] = nums[i]
            k += 1
    
    return k  # k is the count of elements not equal to val
