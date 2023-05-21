public class SistemaInterno {

    private int senha;
    public void autentica(Autenticavel gerente){
       boolean autenticou = gerente.autentica(this.senha);
       if (autenticou) {
           System.out.println("Liberado");
       } else {
           System.out.println("Negado");

       }
    }
    public void autentica(Adm adm) {
        boolean autenticou = adm.autentica(this.senha);
        if (autenticou) {
            System.out.println("Liberado");
        } else {
            System.out.println("Negado");
        }
    }
}
