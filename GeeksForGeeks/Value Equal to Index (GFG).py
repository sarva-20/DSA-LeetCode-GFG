class Solution:
    # Function to find values in array equal to their indices
    def valueEqualToIndex(self, arr):
        result=[]
        
        for i in range(len(arr)):
            if arr[i] == i+1:
                result.append(i+1)
        # If no values found, return "Not Found"        
        if not result:
            return ["Not Found"]
            
        return result

