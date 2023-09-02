import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.time.LocalDate;
public class Aula2 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa ("Guilherme", LocalDate.of(1997, Month.MARCH, 9));
        Pessoa pessoa2 = new Pessoa ("Isabella", LocalDate.of(1997, Month.MARCH, 9));
        Pessoa pessoa3 = new Pessoa ("Fabio", LocalDate.of(1996, Month.MARCH, 4));
        Pessoa [] pessoas = {pessoa1,pessoa2,pessoa3};
        Arrays.sort(pessoas);
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome() + ", Data de Nascimento: " + pessoa.getDataNascimento());
        }
    }
}
