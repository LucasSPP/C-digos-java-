package modelo;

public class TestePessoa {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Funcionario p3 = new Funcionario();
        Professor p4 = new Professor();
        FuncAdm p5 = new FuncAdm();

        p1.setNome("Maria");
        p2.setNome("Lucas");
        p3.setNome("Fabiano");
        p4.setNome("Anildo");
        p5.setNome("Marina");

        p1.setIdade(18);
        p2.setIdade(22);
        p3.setIdade(45);
        p4.setIdade(35);
        p5.setIdade(19);

        p1.setEndereco(" Lauro de Freitas - Bahia");
        p2.setEndereco(" Lauro de Freitas - Bahia, ");
        p3.setEndereco(" Lauro de Freitas - Bahia, ");
        p4.setEndereco(" Salvador - Bahia, ");
        p5.setEndereco(" Simões Filho - Bahia, ");

        p2.setSemestre("2º, ");
        
        p2.setCurso("Analise e Desenvolvimento de Sistemas");

        p3.setSalario(1385.85);
        p4.setSalario(2512.46);
        p5.setSalario(3220.55);

        p4.setDisciplina("Desenvolvimento de Sistemas I");

        p5.setFuncao("Supervisora");

        p5.setSetor("Financeiro");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());

    }
}
