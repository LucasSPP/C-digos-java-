
package javaapplication1;
import modelo.Veiculo;
/**
 *
 * @author ADM
 */

public class TesteVeiculo {
 
    public static void main(String[] args){
    Veiculo veiculo1 = new Veiculo();
    veiculo1.modelo = "Corsa";
    veiculo1.cor = "Prata";
    veiculo1.motor = 1.4;
    System.out.println(veiculo1.exibirDados());
    
    Veiculo veiculo2 = new Veiculo();
    veiculo2.modelo = "Sonic";
    veiculo2.cor = "Preto";
    veiculo2.motor = 1.6;
    System.out.println(veiculo2.exibirDados());
    
    }
}  

