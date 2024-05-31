fibonacci = []
n = 10

for i in range(n):
    if(i > 1):
        fibonacci.append(fibonacci[i - 1] + fibonacci[i - 2])
    else:
        fibonacci.append(i)

print(fibonacci)