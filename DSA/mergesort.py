def merge_sort(arr):
    # Base case: an array with 0 or 1 element is already sorted
    if len(arr) <= 1:
        return arr
    
    mid = len(arr) // 2
    left_half = arr[:mid]
    right_half = arr[mid:]

    # Recursively sort both halves and store the sorted results
    sorted_left = merge_sort(left_half)
    sorted_right = merge_sort(right_half)

    # Merge the two sorted halves and return the result
    return merge_two_sorted_lists(sorted_left, sorted_right)

def merge_two_sorted_lists(left, right):
    sorted_list = []
    i = j = 0 # Pointers for left and right lists

    # Compare elements from both lists and add the smaller one to the sorted_list
    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            sorted_list.append(left[i])
            i += 1
        else:
            sorted_list.append(right[j])
            j += 1
    
    # Append any remaining elements from the left list
    while i < len(left):
        sorted_list.append(left[i])
        i += 1
        
    # Append any remaining elements from the right list
    while j < len(right):
        sorted_list.append(right[j])
        j += 1
        
    return sorted_list

if __name__ == "__main__":
    arr = [38, 27, 43, 3, 9, 82, 10]
    # Assign the final sorted array back to 'arr'
    sorted_arr = merge_sort(arr)
    print(sorted_arr)
    # Output: [3, 9, 10, 27, 38, 43, 82]
