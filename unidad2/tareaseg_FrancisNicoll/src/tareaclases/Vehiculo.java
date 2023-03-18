package tareaclases;

public class Vehiculo{
    String marca;
    String modelo;

    public Vehiculo() {
    }
    
    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void arrancar(){
        System.out.println("El vehiculo ha arrancado");
    }
    
    public void detener(){
        System.out.println("El vehiculo se ha detenido");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
}
