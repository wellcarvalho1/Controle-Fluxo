/**
 * Este programa demonstra o uso da instrução `break` dentro de um loop `for`.
 * 
 * O programa utiliza um loop `for` para iterar de 1 a 5.
 * Dentro do loop, há uma condição `if` que verifica se o número atual é igual a
 * 3.
 * Se for igual a 3, a instrução `break` é executada, interrompendo o loop
 * imediatamente.
 * Caso contrário, o número atual é impresso na tela.
 */
public class ExemploBreak {
    public static void main(String[] args) {
        // Loop que itera de 1 a 5
        for (int numero = 1; numero <= 5; numero++) {
            // Verifica se o número atual é igual a 3
            if (numero == 3)
                // Se for igual a 3, interrompe o loop
                break;

            // Imprime o número atual
            System.out.println(numero);
        }
    }
}
