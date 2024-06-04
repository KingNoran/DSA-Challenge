arr = [-5,2,10,4,6]

def linearSearch(n ,t):
    for i in range(len(n)):
        if(n[i] == t):
            return i
    return -1
        
print(linearSearch(arr, 10))