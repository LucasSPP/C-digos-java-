/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ADM
 */
public class Veiculo {
    public double motor;
    public String cor;
    public String modelo;
    
    public String exibirDados(){
    return "Modelo: "+modelo+" Cor: "+cor+" Motor: "+motor; 
    
    }
}
