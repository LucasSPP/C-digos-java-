
package javaapplication1;
import modelo.Pessoa;

public class TestePessoa {
    public static void main (String[] args){
    Pessoa pessoa1 = new Pessoa();
    pessoa1.Codigo = 1;
    pessoa1.Idade = 20;
    pessoa1.Nome = "lucas";
    pessoa1.ExibirDados();
    
     Pessoa pessoa2 = new Pessoa();
    pessoa1.Codigo = 2;
    pessoa1.Idade = 18;
    pessoa1.Nome = "MarY MARI";
    pessoa1.ExibirDados();
    }
}
