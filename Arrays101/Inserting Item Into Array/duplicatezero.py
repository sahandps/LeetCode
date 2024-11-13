
def duplicateZeros(self, arr):
        for i in range(len(arr) - 1, 0, -1):
            if arr[i] == 0:
                for k in range(len(arr) - 1, i, -1):
                    arr[k] = arr[k - 1]