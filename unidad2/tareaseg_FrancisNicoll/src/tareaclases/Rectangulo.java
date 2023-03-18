package tareaclases;

public class Rectangulo{
    double base;
    double altura;
    
    double calcularArea;

    public Rectangulo() {
    }
    
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getCalcularArea() {
        double calcularArea = (this.base * this.altura)/2;
        return calcularArea;
    }

    public void setCalcularArea(double calcularArea) {
        this.calcularArea = calcularArea;
    }
    
    
}
