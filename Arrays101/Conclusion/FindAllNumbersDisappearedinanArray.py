class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:

        # Step 1: Mark indices based on the value in the array
        for i in range(len(nums)):
            index = abs(nums[i]) - 1  # Find the corresponding index
            nums[index] = -abs(nums[index])  # Mark the number as present by negating it

        # Step 2: Collect indices of positive values as missing numbers
        missing = []
        for i in range(len(nums)):
            if nums[i] > 0:  # If the number is positive, it means the index + 1 is missing
                missing.append(i + 1)

        return missing