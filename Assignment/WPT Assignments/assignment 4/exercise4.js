function fetchData(url, callback) {
  console.log(`Fetching data from ${url}...`);

  setTimeout(function() {
      
      const isError = Math.random() < 0.5;  

      if (isError) {
          
          callback(`Error: Failed to fetch data from ${url}`);
      } else {
          
          const response = `Response from ${url}`;
          callback(null, response);
      }
  }, 2000);
}


fetchData("https://example.com/api", function(error, response) {
  if (error) {
      console.log(error); 
  } else {
      console.log(response); 
  }
});
