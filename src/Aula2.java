import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aula2 {
    public static void main(String[] args) {
        List<String> listaString = new ArrayList<>(List.of("a","z","c"));
        listaString.add("x");
        Collections.sort(listaString);
        System.out.println(listaString);
    }
}
