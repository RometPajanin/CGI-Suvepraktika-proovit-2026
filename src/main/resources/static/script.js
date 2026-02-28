document.addEventListener('DOMContentLoaded', () => {
    const floor = document.getElementById('restaurant-floor');
    const modal = document.getElementById('modal');
    const closeBtn = document.querySelector('.close');
    const tableNumberDisplay = document.getElementById('table-number-display');
    const bookingForm = document.getElementById('booking-form');
    const tableNumberInput = document.getElementById('table-number-input');

    // Generate tables (squares)
    for (let i = 1; i <= 16; i++) {
        const table = document.createElement('div');
        table.classList.add('table');
        table.textContent = i;
        table.dataset.tableNumber = i;
        
        table.addEventListener('click', () => {
            openModal(i);
        });

        floor.appendChild(table);
    }

    function openModal(tableNumber) {
        tableNumberDisplay.textContent = `Table ${tableNumber}`;
        tableNumberInput.value = tableNumber;
        modal.style.display = 'block';
    }

    closeBtn.addEventListener('click', () => {
        modal.style.display = 'none';
    });

    window.addEventListener('click', (event) => {
        if (event.target === modal) {
            modal.style.display = 'none';
        }
    });

    bookingForm.addEventListener('submit', (e) => {
        e.preventDefault();
        const tableNum = tableNumberInput.value;
        const time = document.getElementById('booking-time').value;
        const name = document.getElementById('client-name').value;
        
        console.log(`Booking for Table ${tableNum}: ${name} at ${time}`);
        
        // Here you would typically send data to the backend
        alert(`Table ${tableNum} booked for ${name} at ${time}`);
        modal.style.display = 'none';
        bookingForm.reset();
    });
});
