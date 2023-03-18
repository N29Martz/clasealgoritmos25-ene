package tareaclases;

public class Estudiantes{
    private String nombre;
    private int edad;
    private String carrera;
    private double promedio;

    public Estudiantes() {
    }
    
    public Estudiantes(String nombre, int edad, String carrera, double promedio){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    public void imprimirDatos(){
        System.out.println("Nombre: "+this.getNombre()+"\nEdad: "+this.getEdad()
                + "\nCarrera: "+this.getCarrera()
                +"\nPromedio: "+this.getPromedio());
    }
    
    public void aprobarCurso(double calificacion){
        if (calificacion>=70) {
            System.out.println("El estudiante APROBO el curso");
        }else{
            System.out.println("El estudiante REPROBO el curso");
        }
    }
}
