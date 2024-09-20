import java.util.concurrent.ThreadLocalRandom;

/**
 * Este programa simula Joãozinho gastando sua mesada em doces até que ela
 * acabe.
 * 
 * O programa utiliza um loop `while` para continuar comprando doces enquanto a
 * mesada for maior que zero.
 * Em cada iteração, um valor aleatório entre 2 e 8 é gerado para representar o
 * preço do doce.
 * Se o preço do doce for maior que a mesada restante, o preço é ajustado para o
 * valor da mesada.
 * O preço do doce é então subtraído da mesada e uma mensagem é impressa
 * indicando o doce adicionado ao carrinho.
 * Quando a mesada chega a zero, o loop termina e uma mensagem final é impressa.
 */
public class ExemploWhile {
    public static void main(String[] args) {
        // Valor inicial da mesada
        double mesada = 50.0;

        // Loop que continua enquanto a mesada for maior que zero
        while (mesada > 0) {
            // Gera um valor aleatório entre 2 e 8 para o preço do doce
            Double valorDoce = valorAleatorio();

            // Se o preço do doce for maior que a mesada, ajusta o preço para o valor da
            // mesada
            if (valorDoce > mesada)
                valorDoce = mesada;

            // Imprime o preço do doce adicionado ao carrinho
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");

            // Subtrai o preço do doce da mesada
            mesada = mesada - valorDoce;
        }

        // Imprime o valor final da mesada (zero)
        System.out.println("Mesada:" + mesada);

        // Imprime uma mensagem indicando que Joãozinho gastou toda a mesada
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
    }

    // Método para gerar um valor aleatório entre 2 e 8
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
