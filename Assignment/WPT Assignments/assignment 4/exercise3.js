function fetchData(url, callback) {
  console.log(`Fetching data from ${url}...`);

  
  setTimeout(function() {
      const response = `Response from ${url}`;
      callback(response);
  }, 2000);
}


fetchData("https://example.com/api", function(response) {
  console.log(response);
});
