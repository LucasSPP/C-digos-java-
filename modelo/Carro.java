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
public class Carro {
   private String marca;
   private String modelo;
   private int numPassageiros;
   double capCombustivel;
   double consumoCombustivel;
   void exibirAutonomia(){
   System.out.println("Autonomia do carro é: " + capCombustivel * consumoCombustivel);
   }
   double obterAutonomia(){
       System.out.println("Método obter Autonomia foi chamado.");
       return capCombustivel * consumoCombustivel;
   }
}
