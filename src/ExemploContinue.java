/**
 * Este programa demonstra o uso da instrução `continue` dentro de um loop
 * `for`.
 * 
 * O programa utiliza um loop `for` para iterar de 1 a 5.
 * Dentro do loop, há uma condição `if` que verifica se o número atual é igual a
 * 3.
 * Se for igual a 3, a instrução `continue` é executada, pulando para a próxima
 * iteração do loop.
 * Caso contrário, o número atual é impresso na tela.
 */
public class ExemploContinue {
    public static void main(String[] args) {
        // Loop que itera de 1 a 5
        for (int numero = 1; numero <= 5; numero++) {
            // Verifica se o número atual é igual a 3
            if (numero == 3)
                // Se for igual a 3, pula para a próxima iteração
                continue;

            // Imprime o número atual
            System.out.println(numero);
        }
    }
}
