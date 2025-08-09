class Solution:
    def swapKth(self, arr, k):
        n = len(arr)  # Get the length of the array

        # Convert 1-based index to 0-based index
        # 'k-1' is the k-th element from the beginning
        # 'n-k' is the k-th element from the end
        start_index = k - 1
        end_index = n - k

        # Swap the elements at start_index and end_index
        arr[start_index], arr[end_index] = arr[end_index], arr[start_index]

        # Return the modified array
        return arr
