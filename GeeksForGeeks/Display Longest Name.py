class Solution:
    def longestName(self, arr):
        # Assume the first name is the longest (initially)
        longest = arr[0]

        # Loop through the remaining names in the array
        for name in arr[1:]:
            # If the current name is longer than the current longest
            if len(name) > len(longest):
                longest = name  # Update the longest name

            # If lengths are equal, we keep the earlier one (so do nothing)

        # Return the longest name found
        return longest
