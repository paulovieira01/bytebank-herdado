public class TestaGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setSenha(1908);

        Adm adm = new Adm();
        adm.setSenha(1602);

        Cliente cliente = new Cliente();
        cliente.setSenha(1612);

        SistemaInterno valida = new SistemaInterno();
        valida.autentica(gerente);
        valida.autentica(adm);
        valida.autentica(cliente);






    }
}
