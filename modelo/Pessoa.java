
package modelo;


public class Pessoa {
 String Nome;
 int Idade;
 String endereco;
 
 public void FazerAniversario(){
     this.Idade++;
 }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
 @Override
    public String toString() {
        return "Pessoa{" + "Nome = " + Nome + ", Idade = " + Idade + ", endereço = " + endereco + "}";
    }
 
}
