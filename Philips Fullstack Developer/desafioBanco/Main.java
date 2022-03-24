public class Main {

    public static void main(String[] args) {

        Cliente igor = new Cliente();
        igor.setNome("Igor");
        Cliente joao = new Cliente();
        joao.setNome("João");

        Conta cc = new ContaCorrente(igor);
        cc.depositar(100);
        cc.depositar(3900);

        Conta cc1 = new ContaCorrente(joao);

        Conta poupanca = new ContaPoupanca(igor);
        cc.tranferir(50, poupanca);
        cc.tranferir(1000, cc1);

        Conta poupanca1 = new ContaPoupanca(joao);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();
    }
}
