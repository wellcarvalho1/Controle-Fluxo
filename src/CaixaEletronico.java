public class CaixaEletronico {
    public static void main(String[] args) {
        // Valor inicial do saldo da conta
        double saldo = 25.0;

        // Valor solicitado para o saque
        double valorSolicitado = 26.0;

        // Verifica se o valor solicitado é menor que o saldo disponível
        if (valorSolicitado < saldo) {
            // Realiza o saque, subtraindo o valor solicitado do saldo
            saldo = saldo - valorSolicitado;

            // Exibe o novo saldo após o saque
            System.out.println(saldo);
        } else {
            // Exibe uma mensagem informando saldo insuficiente
            System.out.println("Saldo insuficiente");
        }
    }
}
