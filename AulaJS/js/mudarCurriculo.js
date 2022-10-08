function viniciusDornellas() {
    var nome = document.getElementById("nome");
    nome.innerHTML = "Vinicius Dornellas C. W.";
    var img = document.getElementById("imagem");
    img.src = "img/dornellas.jpg";
    var listaFormacaoPai = document.getElementById("listaFormacao");
    var mestrado =  document.getElementById("mestrado");
    listaFormacaoPai.removeChild(mestrado);
    var tecnico = document.createElement("li");
    tecnico.innerHTML = "Técnico em TI - SENAC - 2019";
    listaFormacaoPai.appendChild(tecnico);
    window.scrollTo(0, 0);
}

function menu(params) {
    if (params == "identificacao") {
        document.getElementById('identificacao').scrollIntoView();
    } else if (params == "formacao") {
        document.getElementById('formacao').scrollIntoView();
    } else if (params == "experiencia") {
        document.getElementById('experiencia').scrollIntoView();
    }else {
        document.getElementById('mapaEnd').scrollIntoView();
    }
}