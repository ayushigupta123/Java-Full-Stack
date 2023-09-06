function validateAndSubmit() {
    var firstName = document.getElementById("firstName").value;
    var lastName = document.getElementById("lastName").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("password").value;
    var errorMessage = document.getElementById("errorMessage");

    errorMessage.innerHTML = "";

    if (!firstName || !lastName || !email || !password) {
        errorMessage.innerHTML = "All fields are required.";
        return;
    }

    if (firstName.length > 10 || lastName.length > 10 || email.length > 10 || password.length > 10) {
        errorMessage.innerHTML = "Field values should not exceed 10 characters.";
        return;
    }

    alert("Registration successful!"); 
}
