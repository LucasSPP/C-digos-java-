
package modelo;

public final class Aluno extends Pessoa {
   private String semestre;
   private String curso;
   
   public void cancelarMatricula(){
   System.out.println("Matricula será cancelada");
   }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
   @Override
    public String toString() {
        return "Aluno{" + "Nome = " + Nome + ", Idade = " + Idade + ", endereço = " + endereco + " semestre = " + semestre + " curso = " + curso + '}';
    }

    
}
