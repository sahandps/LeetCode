from typing import List

def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
    if len(nums2) == 0:
        return nums1
    
    holder = m + n
    i = 0
    while i < len(nums2) - 1:
        nums2 [holder] = nums1[i]
        holder +=1
        i += 1

    nums1.sort()     