
package javaapplication1;
import modelo.Arvore;
public class TesteArvore {
  public static void main (String[] args){
      Arvore maconha = new Arvore();
      maconha.Codigo = 1;
      maconha.Nome = "purple raze";
      maconha.Kilo = 20;
      maconha.ExibirNome();
      
      Arvore palmeira = new Arvore();
      palmeira.Codigo = 2;
      palmeira.Nome = "Palmeira";
      palmeira.Kilo = 50;
      palmeira.ExibirNome();
      
      Arvore pinheiro = new Arvore();
        pinheiro.Codigo = 3;
        pinheiro.Nome = "Pinheiro";
        pinheiro.Kilo = 90;
        pinheiro.ExibirNome();
  }  
}
