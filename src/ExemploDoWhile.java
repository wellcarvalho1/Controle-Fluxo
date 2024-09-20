import java.util.Random;

/**
 * Este programa simula uma chamada telefônica até que alguém atenda.
 * 
 * O programa utiliza um loop `do-while` para simular o toque do telefone.
 * O loop executa pelo menos uma vez e continua executando enquanto a função
 * `tocando()` retornar `true`.
 * A função `tocando()` gera um número aleatório entre 0 e 2. Se o número for
 * igual a 1, a chamada é atendida e a função retorna `false`. Caso contrário, a
 * chamada continua tocando e a função retorna `true`.
 * Quando a chamada é atendida, o loop termina e uma mensagem "Alô !!!" é
 * impressa.
 */
public class ExemploDoWhile {
	public static void main(String[] args) {
		// Imprime a mensagem inicial "Discando..."
		System.out.println("Discando...");

		// Loop que simula o toque do telefone até que alguém atenda
		do {
			// Imprime a mensagem "Telefone tocando" em cada iteração
			System.out.println("Telefone tocando");

		} while (tocando());

		// Imprime a mensagem "Alô !!!" quando a chamada é atendida
		System.out.println("Alô !!!");
	}

	// Função que simula a possibilidade de alguém atender a chamada
	private static boolean tocando() {
		// Gera um número aleatório entre 0 e 2
		boolean atendeu = new Random().nextInt(3) == 1;

		// Imprime se alguém atendeu ou não
		System.out.println("Atendeu? " + atendeu);

		// Retorna `true` se ninguém atendeu, `false` se alguém atendeu
		return !atendeu;
	}
}
