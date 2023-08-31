import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteador {


    private final List<String> elementos;

    public Sorteador(List<String> elementos) {
        this.elementos = elementos;
    }

    public String sortear() {;
        Random aleatorio = new Random();
        int indice = aleatorio.nextInt(24);
        String elemento = elementos.get(indice);
        elementos.remove(indice);
        return elemento;
    }

    public static void main(String[] args) {
        List<String> elementos  = new ArrayList<>();
        elementos.add("banana");
        elementos.add("maçã");
        elementos.add("abacate");
        elementos.add("tomate");
        Sorteador sorteador = new Sorteador(elementos);
        while (!elementos.isEmpty()) {
            System.out.println("Elemento sorteado: " + sorteador.sortear());
        }
    }
}
