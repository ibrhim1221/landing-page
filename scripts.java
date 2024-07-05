document.getElementById('customerForm').addEventListener('submit', function(event) {
    event.preventDefault();
    
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const phone = document.getElementById('phone').value;
    
    if (name && email && phone) {
        document.getElementById('message').innerText = "Thank you for joining our waiting list!";
        document.getElementById('customerForm').reset();
    } else {
        document.getElementById('message').innerText = "Please fill out all fields.";
    }
});
