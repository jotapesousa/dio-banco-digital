import lombok.Data;
import lombok.NonNull;

@Data
public class Cliente {

    @NonNull
    private String nome;
    @NonNull
    private Conta conta;

}
