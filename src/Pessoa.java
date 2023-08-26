import java.time.LocalDate;
import java.time.Period;
import java.util.Collections;
    public class Pessoa implements Comparable<Pessoa> {

        private String nome;

        private LocalDate dataDeNascimento;

        public Pessoa(String nome, LocalDate dataDeNascimento) {
            this.nome = nome;
            this.dataDeNascimento = dataDeNascimento;
        }

        public String getNome(){
            return nome;
        }

        public LocalDate getDataNascimento() {
            return dataDeNascimento;
        }

        public int getIdade(){
            return Period.between(this.dataDeNascimento,LocalDate.now()).getYears();
        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", dataDeNascimento=" + dataDeNascimento +
                    '}';
        }

        // Fazer a classe Pessoa ser ordenada pelos nomes das pessoas
        @Override
        public int compareTo(Pessoa pessoa) {
            Integer idade = getIdade();
            return idade.compareTo(pessoa.getIdade());
        }
    }

