// Sort the array.

// Loop the following:
    // Get the middle index (and number) of the array.
    // If target number is less than middle number, go left. Otherwise, go right.
    // Split the array.


const arr = [-5,2,4,6,10];

function binarySearch(n, t){
    let leftIndex = 0;
    let rightIndex = n.length - 1;

    while(leftIndex <= rightIndex){
        let middleIndex = Math.floor((leftIndex + rightIndex) / 2)
        if (t === n[middleIndex]){
            return middleIndex;
        }
        if(t < n[middleIndex]){
            rightIndex = middleIndex - 1;
        } else {
            leftIndex = middleIndex + 1;
        }
    }
    return -1;
}

console.log(binarySearch(arr, 10));
console.log(binarySearch(arr, 6));
console.log(binarySearch(arr, 20));