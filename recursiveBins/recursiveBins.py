from math import floor

arr = [-5, 2, 4, 6, 10]

def main():
    print(recursiveBins(arr, 10))
    print(recursiveBins(arr, 6))
    print(recursiveBins(arr, 20))

def recursiveBins(n, t):
    return search(n, t, 0, len(n) - 1)

def search(n, t, leftIndex, rightIndex):

    if leftIndex > rightIndex:
        return -1
    
    middleIndex = floor((leftIndex + rightIndex) / 2)

    if t == n[middleIndex]:
        return middleIndex
    
    if t < n[middleIndex]:
        return search(n, t, leftIndex, middleIndex - 1)
    else:
        return search(n, t , middleIndex + 1, rightIndex)
    
if __name__ == "__main__":
    main()