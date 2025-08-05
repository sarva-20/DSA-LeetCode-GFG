def findSum(n):
    #Condition to check if n is a positive integer and is greater than 0
    if n <=0:
        return 0
    return n * (n + 1) // 2 #Mathematical formula for sum of first n natural numbers