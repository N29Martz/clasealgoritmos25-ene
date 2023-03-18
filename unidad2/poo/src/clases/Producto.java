package clases;

import java.util.UUID;

public class Producto{
    // atributos o propiedes => Variables de Clase
    private String codigo; //TODO: Generar codigo de forma automatica
    private String nombre;
    private double precio;
    private int stock;
    private String color;
    private String marca;
    private String descripcion;
    
    //Metodo constructor
    public Producto(){
        UUID uuid = UUID.randomUUID();
        this.codigo = uuid.toString();
    }
    
    // Metodos (Funciones)
    public String getCodigo(){
        return this.codigo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setPrecio(double precio){
        this.precio= precio;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
    public void setStock(int stock){
        this.stock = stock;
    }
    
    public int getStock(){
        return this.stock;
    }
    
     public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
    
     public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
     public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
}
