public class generics {

    public static void main(String[] args) {
        String a = "c";
        String b = "b";
        System.out.println("Maior entre a e b: " + maior(a, b));
    }

    private static String maior(String primeira, String segunda) {
        int resultado = primeira.compareTo(segunda);
        if(resultado == -1){
            return "Maior é: "+segunda;
        }
        else if (resultado == 0){
            return "As Strings são iguais";
        }
        else{
            return "Maior é: "+primeira;
        }

    }
}