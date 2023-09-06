document.getElementById("fetchData").addEventListener("click", function () {
    // Create a new XMLHttpRequest object
    const xhr = new XMLHttpRequest();

    // Define the URL of the XML file
    const url = "blog.xml"; // Replace with the actual file path or URL

    // Configure the request
    xhr.open("GET", url, true);

    // Set the callback function to handle the response
    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {
            // Parse the XML response
            const xmlResponse = xhr.responseXML;

            // Extract information from the XML
            const blogDate = xmlResponse.querySelector("blogdate").textContent;
            const blogAuthor = xmlResponse.querySelector("blog_author").textContent;
            const blogDescription = xmlResponse.querySelector("blog_description").textContent;

            // Display information on the browser console
            console.log("Blog Date: " + blogDate);
            console.log("Blog Author: " + blogAuthor);
            console.log("Blog Description: " + blogDescription);
        }
    };

    // Send the request
    xhr.send();
});