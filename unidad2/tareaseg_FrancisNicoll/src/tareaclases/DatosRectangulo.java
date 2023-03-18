package tareaclases;

public class DatosRectangulo{
    private int largo;
    private int ancho;

    public DatosRectangulo() {
    }
    
    public DatosRectangulo(int largo, int ancho){
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public void calcularArea(int largo, int ancho){
        int area = (ancho * largo)/2;
        System.out.println("El area es: "+area);
    }
    
    public void calcularPerimetro(int largo, int ancho){
        int perimetro= 2*(ancho + largo);
        System.out.println("El perimetro es: "+perimetro);
    }
    
    public void esCuadrado(int largo, int ancho){
        if (largo == ancho) {
            System.out.println("La figura es un CUADRADO");
        }else{
            System.out.println("La figura es un RECTANULO");
        }
    }
}
