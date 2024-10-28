public class Questao2 {
    public static int contarLetraA(String texto) {
        int contador = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if (c == 'a') contador++;
        }
        return contador;
    }

    public static void main(String[] args) {
        String texto = "Java é uma linguagem fantástica"; // Digite a String que desejar!
        int ocorrencias = contarLetraA(texto);
        System.out.println("A letra 'a' aparece " + ocorrencias + " vez(es) na string.");
    }
}
