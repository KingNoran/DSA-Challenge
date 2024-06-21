sampleArr = [-6,20,8,-2,4]

def main():
    print(bubbleSort(sampleArr))


def bubbleSort(arr):
    while(True):
        didSwap = False
        for i in range(len(arr) - 1):
            if(arr[i] > arr[i+1]):
                placeholder = arr[i]
                arr[i] = arr[i+1]
                arr[i+1] = placeholder
                didSwap = True
        
        if(didSwap == False):
           return arr

if __name__ == "__main__":
    main()