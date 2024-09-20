/*
<p>
Este código utiliza uma estrutura switch-case para determinar o tamanho
(PEQUENO, MÉDIO ou GRANDE) com base na sigla fornecida.

Se a sigla não for reconhecida, o resultado será "INDEFINIDO".
</p>
 */

public class SistemaMedida {
    public static void main(String[] args) {
        // Sigla representando o tamanho
        String sigla = "M";

        // Determina o tamanho com base na sigla
        switch (sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MÉDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }
}
