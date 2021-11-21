
package HerancaAnimal;


public abstract class Felino extends Animal{

    
    @Override
    public void fazBarulho() {
        System.out.print("Faz Barulho: Mia");
    }
    public void miar(){
        System.out.print(", Miar: miau miau,");
    }

    @Override
    public String toString() {
        return "Felino{" + "Nome: " + nome + ", Idade: " + idade + " anos" + ", Está Doente: " + doente + ", " ;
    }

    
}
