def replaceElements(arr):

    i = len(arr) - 1
    max_so_far = -1
    holder = 0
    while i >= 0:
        holder = arr[i]
        arr[i] = max_so_far
        if holder > max_so_far:
            max_so_far = holder                    
        i -= 1
    
    return arr

            
       
        



arr = [56903,18666,60499,57517,26961]
replaceElements(arr)