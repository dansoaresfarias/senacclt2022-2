
var button = document.getElementById('read_button');

button.addEventListener('click', function() {

    var card = document.querySelector('.card');

    card.classList.toggle('active');

    if (card.classList.contains('active')) {

        return button.textContent = 'Read less';
    }
    
    button.textContent = 'Read more';
});


var button = document.getElementById('read_button02');

button.addEventListener('click', function() {

    var card = document.querySelector('.card02');

    card.classList.toggle('active');

    if (card.classList.contains('active')) {

        return button.textContent = 'Read less';
    }
    
    button.textContent = 'Read more';
});



var button = document.getElementById('read_button03');

button.addEventListener('click', function() {

    var card = document.querySelector('.card03');

    card.classList.toggle('active');

    if (card.classList.contains('active')) {

        return button.textContent = 'Read less';
    }
    
    button.textContent = 'Read more';
});