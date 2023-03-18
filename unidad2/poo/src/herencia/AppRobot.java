package herencia;

public class AppRobot{
    public static void main(String[] args) {
        Recolector r = new Recolector("Wall-e");
        Recolector t = new Recolector("Termieitor");
        
        System.out.println(r.getNombre());
        r.setCapacidadCarga(100);
        r.llenarBasura();
        System.out.println(t.getNombre());
    }
}
