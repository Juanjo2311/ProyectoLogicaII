
package Modelo.Naves;

import Modelo.Personas.Persona;
import Modelo.Personas.Piloto;

public abstract class Nave {
    public Persona personas[];
    protected String modelo;
    protected boolean estatus;
    protected Piloto piloto;

    public Nave(int capacidad, String modelo, boolean estatus) {
        this.personas = new Persona [capacidad];
        this.modelo = modelo;
        this.estatus = estatus;
//        this.piloto = piloto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
    
    public abstract int cantidadPasajeros();
    
    public abstract boolean puestoDisponible(int puesto);
    
}
