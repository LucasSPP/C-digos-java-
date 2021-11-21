package Pessoa;

public class Pessoa {

    private String Nome;
    private double Altura;
    private int DataNascimento;
    private int Idade;

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public int getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(int DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void CalcularIdade() {
        Idade = 2021 - DataNascimento ;
        
        
    }

    @Override
    public String toString() {
        return "Pessoa{" + "Nome = " + Nome + ", Altura = " + Altura + ", DataNascimento = " + DataNascimento + ", Idade = " + Idade + "}";
    }

}
