function factorial(n){
    let final = 1;
    if(n === 0){
        return final;
    } else if(n < 0){
        return "Positive numbers only";
    }
    for(let i = 1; i <= n; i++){
        final *= i;
    }
    return final;
}

console.log(factorial(5));