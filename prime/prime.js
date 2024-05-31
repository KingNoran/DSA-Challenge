//Old Method

/* function isPrime(n){
    for(let i = 1; i < n; i++){
        for (let j = i; j < n; j++){
            if(i * j === n){
                return false
            }
        }
    }
    return true;
} */

//New Method

function isPrime(n){
    for(let i = 2; i < n; i++){
        if(n % i === 0){
            return false
        }
    }
    return true
}

console.log(isPrime(5));