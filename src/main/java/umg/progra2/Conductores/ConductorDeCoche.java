package umg.progra2.Conductores;

public class ConductorDeCoche extends Conductor {

        private int experienciaAnos;

        public ConductorDeCoche(String Nombre, String Licencia, int ExperienciaAnos) {
            super(Nombre, Licencia);
            this.experienciaAnos= ExperienciaAnos;
        }

        @Override
        public void mostrarInformacion() {
            super.mostrarInformacion();
            System.out.println("Experience en aos: " + experienciaAnos);
        }
    }
