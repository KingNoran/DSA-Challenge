const sampleArr = [-6,20,8,-2,4];

function bubbleSort(arr){
    while(true){
        let didSwap = false;
        for(let i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                let placeholder = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = placeholder;
                didSwap = true;
            }
        }
        if (!didSwap){
            return arr;
        }
    }
}

console.log(bubbleSort(sampleArr));