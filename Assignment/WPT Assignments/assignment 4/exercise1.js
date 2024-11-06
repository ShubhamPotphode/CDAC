
function toUpperCase(str) {
  return str.toUpperCase();
}


function processData(input, callback) {
  const result = callback(input);
  console.log(result);
}


processData("hello world", toUpperCase); 
