public class SistemaInterno {

    private int senha = 1908;
    public void autentica(FuncionarioAut gerente){
       boolean autenticou = gerente.autentica(this.senha);
       if (autenticou) {
           System.out.println("Liberado");
       } else {
           System.out.println("Negado");

       }
    }
    public void autentica(Adm adm){
        boolean autenticou = adm.autentica(this.senha);
        if(autenticou) {
            System.out.println("Liberado");
        } else {
            System.out.println("Negado");
        }
    }
}
