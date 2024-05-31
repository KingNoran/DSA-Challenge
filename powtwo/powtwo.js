/* Old Method */

/* function isPowerOfTwo(n){
    for(let i = 0; i < (n / 2); i++){
        if (2**i === n){
            return true
        }
    }
    return false;
} */

/* New Method */

function isPowerOfTwo(n){
    if(n < 1){
        return false;
    }
    while(n > 1){
        if (n % 2 !== 0){
            return false;
        }
        n /= 2;
    }
    return true;
}

console.log(isPowerOfTwo(1))