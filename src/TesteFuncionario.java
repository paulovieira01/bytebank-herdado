public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario paulo = new Gerente();
        paulo.setNome("Paulo");
        paulo.setCpf("43688045890");
        paulo.setSalario(3500);

        System.out.println(paulo.getCpf());
        System.out.println(paulo.getNome());
         System.out.println(paulo.getSalario());
        System.out.println(paulo.getBonificacao());
    }
}
