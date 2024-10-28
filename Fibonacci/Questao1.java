package Fibonacci;
public class Questao1 {
    public static boolean pertenceFibonacci(int numero) {
        int a = 0, b = 1, temp;
        while (b < numero) {
            temp = a;
            a = b;
            b = temp + b;
        }
        return b == numero || numero == 0;
    }

    public static void main(String[] args) {
        int numero = 21; // Digite o número para conferir
        System.out.println("O número " + numero + (pertenceFibonacci(numero) ? " pertence" : " não pertence") + " à sequência de Fibonacci.");
    }
}
