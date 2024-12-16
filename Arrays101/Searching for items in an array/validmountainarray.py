def validMountainArray(arr):
    if len(arr) < 3:
        return False
    


    i = 0
    while i < len(arr) -1 and arr[i] < arr[i + 1]:
        if arr[i]  < arr[i + 1]:
            i = i + 1
        else:
            break
 
    
    if i == 0 or i == len(arr) - 1:
        return False

    else:
        while i < len(arr) - 1 and arr[i] > arr[i + 1]:
            if arr[i]  > arr[i + 1]:
                i = i + 1
            else:
                break

    if i == len(arr) - 1:
        return True
    else:
        return False        
