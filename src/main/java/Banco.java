import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private String codigo;
    private List<Cliente> clientes;

    public Banco(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
