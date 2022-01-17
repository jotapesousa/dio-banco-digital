public class Main {

    public static void main(String[] args) throws Exception {

        Conta c1 = new ContaCorrente("1234-5", "12345-6");
        Conta c2 = new ContaPoupanca("5432-1", "65432-1");
        System.out.println(c1);
        System.out.println(c2);
        c1.depositar(100d);
        System.out.println(c1);
        c1.transferir(c2, 50d);
        System.out.println("Conta 1: " + c1);
        System.out.println("Conta 2: " + c2);
    }
}
