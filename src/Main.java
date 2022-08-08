public class Main {
    public static void main(String[] args) {
        Cliente francine = new Cliente();
        francine.setNome("Francine");
        Conta cc = new ContaCorrente(francine);
        Conta poupanca = new ContaPoupanca(francine);

        cc.depositar(500);
        cc.transferir(200, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }


}
