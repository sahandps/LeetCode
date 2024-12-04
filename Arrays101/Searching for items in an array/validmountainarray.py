def validMountainArray(arr):
    if len(arr) < 3:
        return False
    

    i = 0
    while arr[i] < arr[i + 1]:
        for x in range(len(arr)):
            if arr[x]  < arr[x + 1]:
                i = i + 1
            else:
                break

        for x in range(i , len(arr)):
            if arr[x]  > arr[x + 1]:
                i = i + 1
            else:
                break

        if i == len(arr):
            return True
        else:
            return False    