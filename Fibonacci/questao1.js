
function pertenceFibonacci(numero) {
    let a = 0, b = 1, temp;
    while (b < numero) {
        temp = a;
        a = b;
        b = temp + b;
    }
    return b === numero || numero === 0;
}

let numero = 21; // Digite o número para conferir
console.log(`O número ${numero} ${pertenceFibonacci(numero) ? 'pertence' : 'não pertence'} à sequência de Fibonacci.`);
