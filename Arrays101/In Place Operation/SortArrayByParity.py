def sortArrayByParity(num):
    j = 0
    for i in range(len(num)):
        if num[i] % 2 == 0:
            num[i], num[j] = num[j], num[i]
            j += 1