package umg.progra2;

import umg.progra2.Conductores.Conductor;
import umg.progra2.Conductores.ConductorDeCoche;
import umg.progra2.Conductores.ConductorDeMoto;
import umg.progra2.Vehiculos.Coche;
import umg.progra2.Vehiculos.Moto;
import umg.progra2.Vehiculos.Vehiculo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conductor conductor = new Conductor("Juan Pérez", "ABC123");
        conductor.mostrarInformacion();
        System.out.println();
        ConductorDeCoche conductorDeCoche = new ConductorDeCoche("María López", "DEF456", 5);
        conductorDeCoche.mostrarInformacion();
        System.out.println();
        ConductorDeMoto conductorDeMoto = new ConductorDeMoto("Carlos Ruiz", "GHI789", true);
        conductorDeMoto.mostrarInformacion();

        Vehiculo Cross = new Moto("Yamaha", "XT150", 2024, false);
        Cross.mostrarDetalles();
        Cross.mostrarDetalles();

        Vehiculo Pickup = new Coche("Toyota", "Hillux", 2019, 2);
        Pickup.mostrarDetalles();
    }
}
