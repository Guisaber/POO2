import java.util.ArrayList;
import java.util.List;

public class Grupo <T> {

    private final List<T> elementosDoGrupo = new ArrayList<>();
    private final int indice;

    public Grupo(int indice) {
        this.indice = indice;
    }

    public void adicionarNoGrupo(T novo) {
        elementosDoGrupo.add(novo);
    }

    @Override
    public String toString() {
        return "Grupo " + indice +
                "{ elementosDoGrupo=" + elementosDoGrupo +
                '}';
    }
}
