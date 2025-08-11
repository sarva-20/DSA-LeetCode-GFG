from bisect import bisect_right, bisect_left

# User function Template for python3
class Solution:
    def getMoreAndLess(self, arr, target):
        # Use bisect_right to count how many elements are <= target
        less_equal = bisect_right(arr, target)
        
        # Use bisect_left to count how many elements are >= target
        greater_equal = len(arr) - bisect_left(arr, target)
        
        return [less_equal, greater_equal]
