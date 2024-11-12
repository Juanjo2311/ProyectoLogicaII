
package Modelo.Naves;

import Modelo.Personas.Piloto;

public abstract class Nave {
    private int capacidad[];
    private String modelo;
    private boolean estatus;
    private Piloto pilotos;

    public Nave(int capacidad, String modelo, boolean estatus, Piloto pilotos) {
        this.capacidad = new int [capacidad];
        this.modelo = modelo;
        this.estatus = estatus;
        this.pilotos = pilotos;
    }

    public Piloto getPilotos() {
        return pilotos;
    }

    public void setPilotos(Piloto pilotos) {
        this.pilotos = pilotos;
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
    
    
}
