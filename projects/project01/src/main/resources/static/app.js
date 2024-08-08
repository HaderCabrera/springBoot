document.getElementById('personForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const name = document.getElementById('name').value;
    const age = document.getElementById('age').value;
    const cedula = document.getElementById('cedula').value;

    const person = {
        cedula: cedula,
        nombre: name,
        edad: age,
    };

    fetch('/api/createPerson', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(person)
    })
    .then(response => response.json())
    .then(data => {
        console.log('Success:', data);
        // Puedes hacer algo con la respuesta aquí
    })
    .catch((error) => {
        console.error('Error:', error);
    });
});