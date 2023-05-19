public class ControleBonificacao {

    private double soma;

//     public void registra(Gerente g){
//        double bonificacao = g.getBonificacao();
//        this.soma = this.soma + bonificacao;
//    }
//  METODO GENERICO QUE SERVE PARA TODOS OBJETOS E QUANDO PASSA PELA PORTA ELE REFERENCIA AO METODO CRIADO
//    EM SUA CLASSE ESPECIFICA
    public void registra(Funcionario f){
        double bonificacao = f.getBonificacao();
        this.soma = this.soma + bonificacao;
    }

//    public void registra(EditorVideo ev){
//        double bonificacao = ev.getBonificacao();
//        this.soma = this.soma + bonificacao;
//    }

    public double getSoma() {
        return soma;
    }
}



