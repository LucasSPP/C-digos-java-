
package modelo;


public class Professor extends Funcionario{
   private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    
   @Override
    public String toString() {
        return "Professor{" + "Nome = " + Nome + ", Idade = " + Idade + ", endereço = " + endereco + " salario = R$ " + salario + ", disciplina = " + disciplina + "}";
    }
   
}
