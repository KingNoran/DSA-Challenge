function recursiveFactorial(n){
    if (n === 0){
        return 1;
    } else {
        return recursiveFactorial(n - 1) * n;
    }
}

console.log(recursiveFactorial(2))