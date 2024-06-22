sampleArr = [-6, 20, 8, -2, 4]

def main():
    insertionSort(sampleArr)
    print(sampleArr)

def insertionSort(arr):
    for i in range(1, len(arr)):
        didSwap = True
        sor = i - 1
        nti = i
        while(didSwap):
            if arr[nti] < arr[sor]:
                placeholder = arr[nti]
                arr[nti] = arr[sor]
                arr[sor] = placeholder
                sor -= 1
                nti -= 1
            else:
                didSwap = False

if __name__ == "__main__":
    main()