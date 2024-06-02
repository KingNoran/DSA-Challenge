def recursiveFibonacci(n):
    if (n < 2):
        return n
    else:
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2)
    
print(recursiveFibonacci(5))