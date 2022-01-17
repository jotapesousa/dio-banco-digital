public abstract class Conta {

    private String agencia;
    private String conta;
    private Double saldo;

    public Conta(String agencia, String conta) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 0d;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double valor) throws Exception {
        if (valor <= 0)
            throw new Exception("Operação Cancelada! Inclua um valor maior do que zero (0)");
        this.saldo += valor;
    }

    public void sacar(Double valor) throws Exception {
        if (valor <= 0)
            throw new Exception("Operação Cancelada! Inclua um valor maior do que zero (0)");
        if (Double.compare(valor, this.saldo) == 1)
            throw new Exception("Operação Cancelada! Você não possui saldo suficiente.");
        this.saldo -= valor;
    }

    public void transferir(Conta cDestino, Double valor) {
        try {
            this.sacar(valor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            cDestino.depositar(valor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            try {
                this.depositar(valor);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    @Override
    public String toString() {
        return "{" +
                "agencia='" + agencia + '\'' +
                ", conta='" + conta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
