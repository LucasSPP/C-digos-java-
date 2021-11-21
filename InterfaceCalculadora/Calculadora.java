
package InterfaceCalculadora;

public class Calculadora extends Calculos implements icalculadora {

    private double resultado;

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    @Override
    public double somar(double a, double b) {
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) {
         return a - b;
    }

    @Override
    public double dividir(double a, double b) {
         return a / b;
    }

    @Override
    public double multiplicar(double a, double b) {
         return a * b;
    }

    @Override
    public double calculo(double a, double b) {
        resultado = a * b;
        return resultado;
    }
    
}
