
package HerancaAnimal;


public abstract class Canino extends Animal {
    @Override
    public void fazBarulho(){
        System.out.print("Faz barulho: Som de canino,");
    }
    
    public void latir(){
        System.out.print(" Latir: AUAU");

    }
    @Override
    public String toString() {
        return "Canino{" + "Nome: " + nome + ", Idade: " + idade + " anos" + ", Está Doente: " + doente + ", ";

    }
}