
package Herenaca;


public class Cliente extends Pessoa {
   private String endereco;
   private int bonus;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id = " + id + ", nome = " + nome + ", telefone = " + telefone + ", sexo = " + sexo + ", cpf = " + cpf + ", endereço = " + endereco + ", bônus = " + bonus + "}";
    }
   
}
