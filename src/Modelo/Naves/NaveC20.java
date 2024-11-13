package Modelo.Naves;

//import Modelo.Personas.Piloto;
public class NaveC20 extends Nave {

    public NaveC20(String modelo) {
        super(21, modelo, true);
    }

    @Override
    public int cantidadPasajeros() {
        int cantidad = 0;
        for (int i = 1; i < 21; i++) {
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
