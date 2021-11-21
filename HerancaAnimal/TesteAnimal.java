
package HerancaAnimal;


public class TesteAnimal {

   public static void main(String[]args){
       
       Cachorro c = new Cachorro();
       Gato g = new Gato();
       Lobo l = new Lobo();
       
       c.setNome("Cachorro");
       c.setIdade(7);
       c.setDoente(true);
        System.out.println(c.toString());
       c.fazBarulho();
       c.latir();
       c.procuraComida();
            
       g.setNome("Gato");
       g.setIdade(5);
       g.setDoente(false);
       System.out.println(g.toString());
        g.dorme();
       g.fazBarulho();
       g.miar();
       g.procuraComida();
       
              
       l.setNome("Lobo");
       l.setIdade(9);
       l.setDoente(false);
        System.out.println(l.toString());
       l.fazBarulho();
       l.latir();
       l.procuraComida();

   }
}
