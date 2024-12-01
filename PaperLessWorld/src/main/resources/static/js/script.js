// script.js

// Function to display a welcome message
function displayWelcomeMessage() {
    alert("Welcome to PaperLess World!");
}

// Function to validate a form (example)
function validateForm() {
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    if (username === "" || password === "") {
        alert("Please fill in both fields.");
        return false;
    } else {
        alert("Form submitted successfully!");
        return true;
    }
}
