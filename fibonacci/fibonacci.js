function fibonacci(n){
    //Reject invalid inputs
    if (n < 2){
        return "Invalid input. Must be a number greater than 1";
    }
    //Declare set
    const fibonacci = [];
    //Make for loop
    for(let i = 0; i < n; i++){
        if (i > 1){
            // Take the last 2 numbers in the set then add them to get the new number
            fibonacci.push(fibonacci[i - 1] + fibonacci[i - 2])
        } else {
            // If the input is merely "2", then push 0 and 1
            fibonacci.push(i);
        } 
    }
    console.log(fibonacci);
}

fibonacci(4);