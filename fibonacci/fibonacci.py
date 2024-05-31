fibonacci = []
n = 10

for i in range(n):
    if(i > 1):
        fibonacci.append(fibonacci[len(fibonacci) - 1] + fibonacci[len(fibonacci) - 2])
    else:
        fibonacci.append(i)

print(fibonacci)