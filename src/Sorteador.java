import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/*
 * Refatorar a classe sorteador para que seja genérica
 */
public class Sorteador<T> {

    private final List<T> elementos;

    public Sorteador(List<T> elementos) {
        this.elementos = elementos;
    }

    /**
     * Sorteia e remove um elemento da lista
     * @return
     */
    public T sortear() {
        if (elementos.isEmpty()) {
            return null;
        }
        int indiceSorteado = ThreadLocalRandom.current().nextInt(elementos.size());
        T elementoSorteado = elementos.remove(indiceSorteado);
        return  elementoSorteado;
    }


    /**
     * Inicializar a quantidade de grupos especificadas;
     * Fazer uma iteração que enquanto tiver registro na lista sortear um registro e adicionar em um grupo;
     * @param numeroDeGruposEsperados
     * @return
     */
    public List<Grupo <T>> agrupar(int numeroDeGruposEsperados) {

        List<Grupo<T>> grupos = inicializarGrupos(numeroDeGruposEsperados);

        int indiceDoGrupoAtual = 0;
        while (possuiElementos()) {
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

    private boolean possuiElementos() {
        return !elementos.isEmpty();
    }

    private  List<Grupo<T>> inicializarGrupos(int numeroDeGruposEsperados) {
        List<Grupo<T>> grupos = new ArrayList<>();

        for (int i = 0; i < numeroDeGruposEsperados; i++) {
            grupos.add(new Grupo<>(i));
        }
        return grupos;
    }
}