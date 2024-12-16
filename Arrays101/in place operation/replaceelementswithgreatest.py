def replaceElement(arr):
    i = len(arr) - 2

    holder = arr[-1]

    arr[-1] = -1
    while i >= 0:
        temp = arr[i]

        arr[i] = holder


        holder = max(holder, temp)

        i -= 1

    return arr

arr = [17,18,5,4,6,1]
replaceElement(arr)       