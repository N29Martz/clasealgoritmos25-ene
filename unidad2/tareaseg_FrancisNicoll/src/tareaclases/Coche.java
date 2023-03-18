package tareaclases;


public class Coche extends Vehiculo{
    private int velocidad;
    
    public Coche() {
    }
    
    public Coche(String marca, String modelo, int velocidad){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    
    public void acelerar(int aumentar){
        if(aumentar==1){
            System.out.println("El vehiculo ha aumentado su velocidad");
        }else{
            System.out.println("El vehiculo mantiene se velocidad inicial");
        }
    }
    
    public void frenar(int detener){
        if(detener==1){
            detener();
        }else{
            System.out.println("El vehiculo mantiene se velocidad inicial");
        }
        
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
    public void imprimirDatos(){
        System.out.println("Marca "+this.getMarca()+"\nModelo: "+this.getModelo()
                + "\nVelocidad "+this.getVelocidad());
    }
}
