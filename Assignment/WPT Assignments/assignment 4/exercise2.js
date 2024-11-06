function forEachElement(arr, callback) {
  for (let i = 0; i < arr.length; i++) {
      callback(arr[i], i);
  }
}

// Test the function with an anonymous callback function
forEachElement([1, 2, 3, 4], function(element, index) {
  console.log(`Index: ${index}, Value: ${element * 2}`);
});
