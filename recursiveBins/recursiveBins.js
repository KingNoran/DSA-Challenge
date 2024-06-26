const arr = [-5,2,4,6,10]

function recursiveBins(n, t)
{
    return search(n, t, 0, n.length - 1);
}

function search(n, t, leftIndex, rightIndex){
    
    if(leftIndex > rightIndex){
        return -1;
    }

    let middleIndex = Math.floor((leftIndex + rightIndex) / 2);

    if(t === n[middleIndex]){
        return middleIndex;
    }

    if(t < n[middleIndex]){
        return search(n, t, leftIndex, middleIndex - 1);
    } else {
        return search(n, t, middleIndex + 1, rightIndex);
    }
}

console.log(recursiveBins(arr, 10));
console.log(recursiveBins(arr, 6));
console.log(recursiveBins(arr, 20));