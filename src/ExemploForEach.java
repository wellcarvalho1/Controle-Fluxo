/**
 * Este programa demonstra como iterar sobre um array de strings utilizando um
 * loop for-each.
 * 
 * O programa define um array de strings chamado "alunos" contendo quatro nomes.
 * Em seguida, utiliza um loop for-each para percorrer cada elemento do array.
 * Para cada elemento, o programa imprime o nome do aluno.
 */
public class ExemploForEach {
    public static void main(String[] args) {
        // Declaração e inicialização do array de strings "alunos"
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // Loop for-each que itera sobre cada elemento do array "alunos"
        for (String aluno : alunos) {
            // Imprime o nome do aluno atual
            System.out.println("Nome do aluno(a) é: " + aluno);
        }
    }
}
