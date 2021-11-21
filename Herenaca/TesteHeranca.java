
package Herenaca;


public class TesteHeranca {
  public static void main (String[] args){
      Pessoa p1 = new Pessoa();
      Cliente c1 = new Cliente();
      Funcionario f1 = new Funcionario();
      
      p1.setNome("Luis");
      p1.setId(1);
      p1.setCpf("674.222.546-12");
      p1.setSexo("Masculino");
      p1.setTelefone("(71)99933-4356");
      
      c1.setNome("Malia");
      c1.setId(2);
      c1.setCpf("704.292.846-82");
      c1.setSexo("Feminino");
      c1.setTelefone("(71)98933-9357");
      c1.setEndereco("Rua fim de mundo - centro - Lauro de Freitas");
      c1.setBonus(6);
  
      f1.setNome("Lucas");
      f1.setId(3);
      f1.setCpf("438.178.973-31");
      f1.setSexo("Masculino");
      f1.setTelefone("(71)99515-7152");
      f1.setMatricula(226);
      f1.setSalario(2000);
      
      System.out.println(p1.toString());
      System.out.println(c1.toString());
      System.out.println(f1.toString());
  }  
}
