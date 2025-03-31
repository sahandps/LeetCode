def validMountainArray(arr):
        num_elements = len(arr)
      
        if num_elements < 3:
            return False
      
        i, j = 0, num_elements - 1
      
        while i + 1 < num_elements - 1 and arr[i] < arr[i + 1]:
            i += 1
      
        while j - 1 > 0 and arr[j] < arr[j - 1]:
            j -= 1

        return i == j