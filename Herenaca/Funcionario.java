
package Herenaca;


public class Funcionario extends Pessoa {
    private int matricula;
    private int salario;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "id = " + id + ", nome = " + nome + ", telefone = " + telefone + ", sexo = " + sexo + ", cpf = " + cpf + ", matricula = " + matricula + ", salario R$ = " + salario + "}";
    }
    
}
