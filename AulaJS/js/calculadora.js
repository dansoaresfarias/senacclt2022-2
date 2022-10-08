function somar() {
    var num1 = parseFloat(document.getElementById("num1").value);
    var num2 = parseFloat(document.getElementById("num2").value);
    document.getElementById("resultado").innerHTML = "<b>Resultado: </b>" + (num1 + num2);
}

function subtrair() {
    var num1 = parseFloat(document.getElementById("num1").value);
    var num2 = parseFloat(document.getElementById("num2").value);
    document.getElementById("resultado").innerHTML = "<b>Resultado: </b>" + (num1 - num2);
}

function multiplicar() {
    var num1 = parseFloat(document.getElementById("num1").value);
    var num2 = parseFloat(document.getElementById("num2").value);
    document.getElementById("resultado").innerHTML = "<b>Resultado: </b>" + (num1 * num2);
}

function dividir() {
    try {
        var num1 = parseFloat(document.getElementById("num1").value);
        var num2 = parseFloat(document.getElementById("num2").value);
        if(num2 == 0) throw "Não pode dividir por ZERO!"
        document.getElementById("resultado").innerHTML = "<b>Resultado: </b>" + (num1 / num2);
    } catch (error) {
        alert(error);
    }
}