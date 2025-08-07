# Your task is to complete this function
# Function should return true/false
def isPalinArray(arr):
    # Code here
    for num in arr:
        if str(num) != str(num)[::-1]:
            return False
    return True

'''
#Solution using math (no string conversion):
def isPalindrome(num):
    original = num
    reverse = 0

    while num > 0:
        digit = num % 10
        reverse = reverse * 10 + digit
        num //= 10

    return original == reverse

def isPalinArray(arr):
    for num in arr:
        if not isPalindrome(num):
            return False
    return True
'''