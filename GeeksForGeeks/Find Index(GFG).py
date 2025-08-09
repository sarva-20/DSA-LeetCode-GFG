class Solution:
    def findIndex(self, arr, key):
        # Step 1: Initialize 'start' and 'end' indices as -1.
        # These will hold the first and last positions of the key in the array.
        start = -1
        end = -1

        # Step 2: Loop through the array using index 'i'
        for i in range(len(arr)):
            # Step 3: If the current element matches the key
            if arr[i] == key:
                # Step 4: If this is the first time we're finding the key,
                # set 'start' index to the current position
                if start == -1:
                    start = i

                # Step 5: Whether first time or not, update 'end' index
                # because this might be the last occurrence
                end = i

        # Step 6: After loop, return the start and end indices as a list
        # If key was not found at all, both will remain -1
        return [start, end]
