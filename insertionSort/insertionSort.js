const sampleArr = [-6, 20, 8, -2, 4];

function insertionSort(arr){
    for(let i = 1; i < arr.length; i++){ //cur = current index
        let didSwap = true;
        let sor = i - 1;
        let nti = i;
        while(didSwap){
            if (arr[nti] < arr[sor]){
                let placeholder = arr[nti]
                arr[nti] = arr[sor]
                arr[sor] = placeholder
                sor--;
                nti--;
            } else {
                didSwap = false;
            }
        }
    }
}

insertionSort(sampleArr);
console.log(sampleArr);