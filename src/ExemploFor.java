/**
 * Este programa simula a contagem de carneirinhos que Joãozinho conta antes de dormir.
 * 
 * O programa utiliza um loop `for` para iterar de 1 a 20, imprimindo a frase 
 * "carneirinho(s)" junto com o número correspondente em cada iteração.
 * 
 * Após a contagem, o programa imprime a mensagem "Joãozinho Dormiu!!".
 */
public class ExemploFor {
	public static void main(String[] args) {
		// Loop que itera de 1 a 20
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            // Imprime o número atual de carneirinhos seguido da frase " - Carneirinho(s)"
            System.out.println(carneirinhos + " - Carneirinho(s)");
        }

        // Imprime a mensagem indicando que Joãozinho dormiu
        System.out.println("Joãozinho Dormiu!!");
	}
}

