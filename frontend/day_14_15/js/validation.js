// LOGIN FUNCTION
function login() {
  const username = document.getElementById("loginUsername").value.trim();
  const password = document.getElementById("loginPassword").value.trim();

  if (username === "" || password === "") {
    alert("All fields are mandatory for login!");
    return;
  }

  console.log("Login Attempt:");
  console.log("Username:", username);
  console.log("Password:", password);

  alert("Login successful (demo)!");
}

// REGISTRATION FUNCTION
function register() {
  const name = document.getElementById("regName").value.trim();
  const email = document.getElementById("regEmail").value.trim();
  const username = document.getElementById("regUsername").value.trim();
  const password = document.getElementById("regPassword").value.trim();

  // Mandatory fields
  if (!name || !email || !username || !password) {
    alert("All fields are mandatory!");
    return;
  }

  // Email validation
  const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  if (!emailPattern.test(email)) {
    alert("Please enter a valid email address!");
    return;
  }

  // Username validation
  const usernamePattern = /^[a-zA-Z0-9]+$/;
  if (!usernamePattern.test(username)) {
    alert("Username should not contain special characters!");
    return;
  }

  // Password validation
  const passwordPattern = /^(?=.*[A-Z])(?=.*\d)[A-Za-z\d]{8,}$/;
  if (!passwordPattern.test(password)) {
    alert("Password must be at least 8 characters, contain one uppercase letter, and one number!");
    return;
  }

  console.log("Registration Details:");
  console.log("Name:", name);
  console.log("Email:", email);
  console.log("Username:", username);
  console.log("Password:", password);

  alert("Registration successful (demo)!");
}
