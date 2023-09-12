package ProjetoPoo2;

import java.time.LocalDateTime;

public class CadastroAluguel <T> extends  AluguelVeiculosRepositorio {

    public boolean alugarVeiculo (T pessoa, T veiculo,  LocalDateTime data, String local){
            AluguelVeiculos aluguel = new AluguelVeiculos<>(pessoa,veiculo,data,local);
            aluguelVeiculos.add(aluguel);
            return true;
    }

}
