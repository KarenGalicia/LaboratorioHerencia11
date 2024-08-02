package umg.progra2.Conductores;

public class ConductorDeMoto extends Conductor {
    private boolean TienLicenceMoto;

    public ConductorDeMoto(String Nombre, String Licencia, boolean TienLicenceMoto) {
        super(Nombre, Licencia);
        this.TienLicenceMoto = TienLicenceMoto;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("tiene Licencia de moto; " + (TienLicenceMoto ? "Sí" : "No"));
    }

}
