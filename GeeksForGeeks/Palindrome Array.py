from typing import List

class Solution:
    def isPerfect(self, arr):
        # Check if array is equal to its reverse
        return 1 if arr == arr[::-1] else 0
    

'''
Another solution
from typing import List

class Solution:
    def isPerfect(self, arr: List[int], n: int) -> int:
        # Step 1: Use two pointers to check if the array is a palindrome
        left = 0           # Start pointer
        right = n - 1      # End pointer

        while left < right:
            if arr[left] != arr[right]:
                # If mismatch found, it's not a palindrome
                return 0
            left += 1
            right -= 1

        # If loop completes without mismatch, it's a palindrome
        return 1

'''