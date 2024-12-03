def checkIfExist(arr):
    for i in range(len(arr)):
        for j in range(1, len(arr)):
            if arr[i] == arr[j] *2 :
                return True

        


test = [7,1,14,11]


checkIfExist(test)