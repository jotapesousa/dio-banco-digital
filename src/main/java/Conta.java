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

    @Override
    public String toString() {
        return "{" +
                "agencia='" + agencia + '\'' +
                ", conta='" + conta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
