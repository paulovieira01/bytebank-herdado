public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();

        gerente.setSenha(1908);

        SistemaInterno valida = new SistemaInterno();
        valida.autentica(gerente);

        Adm adm = new Adm();
        adm.setSenha(1602);

        SistemaInterno valid = new SistemaInterno();
        valid.autentica(adm);

        




    }
}
