package sobreescritura.personas;

public class Personas{
    private String nombre;
    private char genero;
    private int edad;

    public String getNombre() {
        
       return nombre;
    }

    public void setNombre(String nombre) {        
        this.nombre = nombre;
    }

    public String getGenero() {
        if(this.genero == 'M'){
            return "Hombre";
        }else{
            return "Mujer";
        }
        
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.getNombre()+"\nEdad: "+this.getEdad()
                + "\nGenero: "+this.getGenero();
    }

    public Personas(String nombre, char genero, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }
    
    
}
