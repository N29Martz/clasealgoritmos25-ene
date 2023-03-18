package herencia;

public class Recolector extends Robot{
    private int velocidad;
    private int capacidadCarga;
    private double llenar;

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public void llenarBasura(){
        System.out.println("Llenando de basura el deposito");
        for(int i=0; i<=(this.capacidadCarga *0.7); i++){
            try{
                Thread.sleep(300);
                System.out.print(".");
                this.llenar++;
            } catch (InterruptedException e){
                
            }
         
        }
            this.compactar();
            this.tirarBasura();
            System.out.println("");
    }
    
    private void compactar() {
        System.out.println("\nCompactando basura");
  
    }
    
    private void tirarBasura(){
        System.out.println("Tirando Basura....");
        this.llenar =0;
        System.out.println("El deposito esta vacio");
    }
    
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
            
    //TODO: Metodo compactar basura
    
    public Recolector() {
        
    }
    
    public Recolector(String nombre){
        setNombre(nombre);
    }
}