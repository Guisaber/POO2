import java.util.ArrayList;
import java.util.List;

public class agrupador <T>{

    public List<Grupo <T>> agrupar(int numeroDeGruposEsperados, List<T> elementos) {

        List<Grupo<T>> grupos = inicializarGrupos(numeroDeGruposEsperados);

        int indiceDoGrupoAtual = 0;
        while (possuiElementos(elementos)) {
            T elementoSorteado = sortear();
            Grupo grupoAtual = grupos.get(indiceDoGrupoAtual);
            grupoAtual.adicionarNoGrupo(elementoSorteado);
            indiceDoGrupoAtual++;
            if (indiceDoGrupoAtual == numeroDeGruposEsperados) {
                indiceDoGrupoAtual = 0;
            }
        }

        return grupos;
    }

    private  List<Grupo<T>> inicializarGrupos(int numeroDeGruposEsperados) {
        List<Grupo<T>> grupos = new ArrayList<>();

        for (int i = 0; i < numeroDeGruposEsperados; i++) {
            grupos.add(new Grupo<>(i));
        }
        return grupos;
    }

    private boolean possuiElementos(List<T> elementos) {
        return !elementos.isEmpty();
    }

}
