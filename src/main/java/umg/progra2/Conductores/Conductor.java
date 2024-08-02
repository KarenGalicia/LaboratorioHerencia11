package umg.progra2.Conductores;

public class Conductor {
    private String Nombre;
    private String Licencia;

    public Conductor(String Nombre, String Licencia) {
        this.Nombre = Nombre;
        this.Licencia = Licencia;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Licencia: " + Licencia);
    }

}
