package modelo;
import java.util.Scanner;
import Pessoa.Pessoa;



/**
 *
 * @author ADM
 */
public class TestePessaoa {
                                         //|excessão para conversão de data|     
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    Pessoa pessoa1 = new Pessoa();
    
    System.out.println("Digite sua data de nascimento");
    pessoa1.DataNascimento = ler.nextInt();
    
    System.out.println("Digite a data atual");
    pessoa1.Ano = ler.nextInt();
    
   
    pessoa1.Idade = ler.nextInt();
    
    pessoa1.setNome("lucas");
    pessoa1.setAltura(1.8);
    
    
    System.out.println(pessoa1.exibirDados());
    
    
    }
    
}  

