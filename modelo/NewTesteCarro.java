
package modelo;


public class NewTesteCarro {
     public static void main(String[] args){
    Carro carro1 = new Carro();
    carro1.marca = "Chevrolet";
    carro1.modelo = "Corsa";
    carro1.numPassageiros = 35;
    carro1.capCombustivel = 100;
    carro1.consumoCombustivel = 0.2;
    System.out.println(carro1.marca);
    System.out.println(carro1.modelo);
    
    
    carro1.exibirAutonomia();
    
    double autonomia = carro1.obterAutonomia();
    System.out.println("A autonomia do carro é: " + autonomia);
    System.out.println("A autonomia do carro é: " + carro1.obterAutonomia());
     }
}
