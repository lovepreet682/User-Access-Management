function login() {
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    fetch('/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded',
        },
        body: `username=${username}&password=${password}`,
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }
        return response.json();
    })
    .then(data => {
        // Handle the response data
        console.log(data);
        
        // Check the user role and redirect accordingly
        if (data.role === 'developer') {
            window.location.href = '/api/users/developer';
        } else if (data.role === 'supervisor') {
            window.location.href = '/api/users/supervisor';
        } else if (data.role === 'admin') {
            window.location.href = '/api/users/admin';
        } else {
            // Handle other roles or scenarios if needed
            console.error('Invalid role:', data.role);
        }
    })
    .catch(error => {
        // Handle errors
        console.error('There was a problem with the fetch operation:', error);
        document.getElementById("errorMessage").innerText = 'Invalid credentials';
    });
}
