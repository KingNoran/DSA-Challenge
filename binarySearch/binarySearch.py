import math

arr = [-5,2,4,6,10]

def binarySearch(n, t):
    leftIndex = 0
    rightIndex = len(n) - 1

    while(leftIndex <= rightIndex):
        middleIndex = math.floor((leftIndex + rightIndex) / 2)

        if t == n[middleIndex]:
            return middleIndex
        if t < n[middleIndex]:
            rightIndex = middleIndex - 1
        else:
            leftIndex = middleIndex + 1
    return -1

print(binarySearch(arr, 10))