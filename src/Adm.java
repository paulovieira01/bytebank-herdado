public class Adm extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;


    public Adm() {
        this.autenticador = new AutenticacaoUtil();
    }

    //    QUANDO CRIEI ESSA NOVA CLASSE FUI OBRIGADO A INCLUIR ESSE METODO POIS ELE É ABSTRATO NA
    //    MINHA CLASSE MAE
    @Override
    public double getBonificacao() {
        return 50;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);

    }

    @Override
    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);
    }
}
