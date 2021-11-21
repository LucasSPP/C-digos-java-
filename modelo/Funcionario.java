
package modelo;

public class Funcionario extends Pessoa {
  double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
  @Override
    public String toString() {
        return "Funcionario{" + "Nome = " + Nome + ", Idade = " + Idade + ", endereço = " + endereco + " salario = R$ " + salario + "}";
    }
  
}
