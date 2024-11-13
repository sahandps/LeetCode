class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        if n == 0:
            return nums1
        else:
            counter = 0
            for x in range(m + n):
            
                if counter < n:
                    nums1[m + x] = nums2[counter]
                    counter = counter +1
            nums1.sort()