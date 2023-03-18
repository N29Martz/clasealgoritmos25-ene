package tareaclases;

public class Calculadora{
    
    private int num1;
    private int num2;
    
    private int suma;
    private int resta;
    private int mult;
    private double dividir;

    public Calculadora() {
    }
    
    public Calculadora(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public int getSuma() {
        int suma = this.num1 + this.num2;
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getResta() {
        int resta = this.num1 - this.num2;
        return resta;
    }

    public void setResta(int resta) {
        this.resta = resta;
    }

    public int getMult() {
        int mult = this.num1 * this.num2;
        return mult;
    }

    public void setMult(int mult) {
        this.mult = mult;
    }

    public double getDividir() {
        double dividir = (double)this.num1 / (double)this.num2;
        return dividir;
    }

    public void setDividir(double dividir) {
        this.dividir = dividir;
    }
    
    
}
