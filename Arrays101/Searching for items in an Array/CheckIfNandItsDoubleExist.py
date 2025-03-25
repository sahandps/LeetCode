def checkIfExist( arr):
    i = 1
    j = 0

    while i < len(arr) and j < len(arr):
        
        if i != j and arr[i] / 2 == arr[j] or arr[j] * 2 == arr[i] or arr[i] * 2 == arr[j]:
                return True
            
        i += 1
        if i == len(arr):
            j += 1
            i = 0
    return False    


arr = [-2,0,10,-19,4,6,-8]
checkIfExist(arr)       