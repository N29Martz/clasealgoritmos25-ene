package tareaclases;

public class Cuadrado extends Rectangulo{
    private int lado;

    public Cuadrado() {
    }
    
    public Cuadrado(int lado){
        this.lado = lado;
    }
    
    @Override
     public double getCalcularArea() {
        double calcularArea = this.lado * this.lado;
        return calcularArea;
    }

    @Override
    public void setCalcularArea(double calcularArea) {
        this.calcularArea = calcularArea;
    }
}
