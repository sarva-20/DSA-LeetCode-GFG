class Solution:
    def getAlternates(self, arr):
        # This function returns the alternate elements of the array.
        # It takes an array as input and returns a new array containing
        # every second element starting from the first element.
        #Slicing method
        result = arr[::2]
        return result
    
    '''
    Solution 2 : By Looping
    class Solution:
    def getAlternates(self, arr):
        result = []
        for i in range(0, len(arr), 2):  # Start from 0, step by 2 (alternate indices)
            result.append(arr[i])       # Add element at index i to result
        return result
    '''