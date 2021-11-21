
package HerancaAnimal;


public abstract class Animal {
    protected String nome;
    protected int idade;
    protected boolean doente;
    
    public void dorme(){
      System.out.print("Está dormindo, ");
    }
    public abstract void fazBarulho();

    public abstract void procuraComida();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isDoente() {
        return doente;
    }

    public void setDoente(boolean doente) {
        this.doente = doente;
    }
    
}
