/* 
<p>
Este código utiliza uma estrutura switch-case para exibir os benefícios
associados a um plano de dados móvel.

**Observação: A falta de `break` entre os casos faz com que, após encontrar
um caso correspondente, todos os casos subsequentes também sejam executados.
</p>
*/

public class PlanoOperadora {
    public static void main(String[] args) {
        // Sigla representando o plano de dados
        String plano = "M"; // M / T

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e Intagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
