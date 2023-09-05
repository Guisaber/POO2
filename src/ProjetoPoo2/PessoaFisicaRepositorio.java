package ProjetoPoo2;

import java.util.ArrayList;

public class PessoaFisicaRepositorio {
   static ArrayList<PessoaFisica> pessoaFisica = new ArrayList<>();

//falta fazer o listarPessoas funcionar.
   public static void listarPessoas (){
      for (int i = 0; i < pessoaFisica.size(); i++) {
         PessoaFisica pessoa = pessoaFisica.get(i);
         System.out.println(pessoaFisica.toString());
      }
   }
}
