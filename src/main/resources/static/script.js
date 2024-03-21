document.getElementById('sortForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const inputNumbers = document.getElementById('inputNumbers').value;
    const numbersArray = inputNumbers.split(',').map(Number);

    fetch('http://localhost:8080/sort', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(numbersArray),
    })
    .then(response => response.json())
    .then(sortedNumbers => {
        const resultDiv = document.getElementById('result');
        resultDiv.innerHTML = '<strong>Sorted Integers:</strong> ' + sortedNumbers.join(', ');
    })
    .catch(error => console.error('Error:', error));
});
