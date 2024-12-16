def checkIfExist(arr):
    resu = False
    for i in range(len(arr)):
        for j in range(len(arr)):
            if i != j and arr[i] == 2 * arr[j]:
                resu = True
                    
    return resu       

        


test = [7,1,14,11]


checkIfExist(test)