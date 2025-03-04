from typing import List
from collections import deque


def duplicateZeros(arr: List[int]) -> None:
    b = len(arr) - 2
    i = 0
    while i < b:
        if arr[i] == 0:
            arr.insert(i + 1, 0 )
            arr.pop(-1)
            i += 1
        i += 1



arr = [1,0,2,3,0,4,5,0]
duplicateZeros(arr)
print(arr)