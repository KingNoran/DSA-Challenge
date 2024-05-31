""" Old Method """

""" def isPrime(n):
    for i in range(1, n):
        for j in range(i, n):
            if(i * j == n):
                return False
    return True """

def isPrime(n):
    for i in range(2, n):
        if (n % i == 0):
            return False
    return True

print(isPrime(12))