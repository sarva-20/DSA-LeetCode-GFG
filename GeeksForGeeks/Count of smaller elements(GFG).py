#User function Template for python3

class Solution:
    def countOfElements(self, x, arr):
        # Code Here
        count = 0
        for num in arr:
            if num<=x:
                count += 1
        return count


'''
One liner function to count the number of elements in the array
def countOfElements(self, x, arr):
    return sum(1 for num in arr if num <= x)
'''