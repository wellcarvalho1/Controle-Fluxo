/**
 * Este programa demonstra como iterar sobre um array de strings e imprimir cada
 * elemento junto com seu índice.
 * 
 * O programa define um array de strings chamado "alunos" contendo quatro nomes.
 * Em seguida, utiliza um loop `for` para percorrer cada elemento do array.
 * Para cada elemento, o programa imprime o índice do elemento e o próprio
 * elemento.
 */
public class ExemploForArray {
    public static void main(String[] args) {
        // Declaração e inicialização do array de strings "alunos"
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // Loop que itera sobre cada elemento do array "alunos"
        for (int x = 0; x < alunos.length; x++) {
            // Imprime o índice do elemento atual (x) e o nome do aluno
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }
    }
}
