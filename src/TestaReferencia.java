public class TestaReferencia {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente();
        gerente1.setNome("Paulo");
        gerente1.setSalario(3500);


        EditorVideo editorVideo1 = new EditorVideo();
        editorVideo1.setNome("Ricardo");
        editorVideo1.setSalario(2750);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(gerente1);
        controle.registra(editorVideo1);

        System.out.println(controle.getSoma());
//        System.out.println(controle.getSoma());


    }
}
