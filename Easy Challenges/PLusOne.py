class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        # Convert entire digit list to a number
        num_str = ''.join(str(d) for d in digits)
        num = int(num_str) + 1  # Add one
        
        # Convert back to list of digits
        return [int(d) for d in str(num)]
