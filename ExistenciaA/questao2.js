function contarLetraA(texto) {
    let contador = 0;
    for (let char of texto) {
        if (char.toLowerCase() === 'a') contador++;
    }
    return contador;
}

let texto = "JavaScript é uma linguagem fantástica"; // Digite qualquer String!
let ocorrencias = contarLetraA(texto);
console.log(`A letra 'a' aparece ${ocorrencias} vez(es) na string.`);
