import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class Banco {

    @NonNull
    private String nome;
    @NonNull
    private String codigo;
    private List<Cliente> clientes;

}
