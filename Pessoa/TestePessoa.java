
package Pessoa;

public class TestePessoa {
    public static void main (String[] args){
        Pessoa p1 = new Pessoa();
        
        p1.setAltura(1.85);
        p1.setDataNascimento(2000);
        p1.setNome("Lucas");
        p1.CalcularIdade();
        System.out.println(p1.toString());
    }
}
