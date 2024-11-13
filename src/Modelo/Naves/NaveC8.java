package Modelo.Naves;

//import Modelo.Personas.Piloto;
public class NaveC8 extends Nave {

    public NaveC8(String modelo) {
        super(9, modelo, true);
    }

    @Override
    public int cantidadPasajeros() {
        int cantidad = 0;
        for (int i = 1; i < 9; i++) {
            if (personas[i] != null) {
                cantidad++;
            }
        }
        return cantidad;
    }

    @Override
    public boolean puestoDisponible(int puesto) {
        if (personas[puesto] == null) {
            return true;
        }
        return false;
    }

}
