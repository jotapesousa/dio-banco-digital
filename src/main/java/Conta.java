import lombok.Data;
import lombok.NonNull;

@Data
public abstract class Conta {

    @NonNull
    private String agencia;
    @NonNull
    private String conta;
    private Double saldo = 0d;

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
}
