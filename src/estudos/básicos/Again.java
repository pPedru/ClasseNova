package estudos.básicos;
public class Again {
    public static void main ( String[] args ) {
        String primeiroNome= "Pedro";
        String segundoNome= "Henrique";
        String nomeCompleto= nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
     }

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Nome completo é " + primeiroNome.concat(" ").concat(segundoNome);


}
}
