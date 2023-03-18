package sobreescritura;

public class AppSobreescritura{
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.hacerSonido();
        
        Perro firus = new Perro();
        firus.hacerSonido();
    }
}
