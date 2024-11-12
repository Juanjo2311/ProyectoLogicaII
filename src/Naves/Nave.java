
package Naves;

public abstract class Nave {
    protected int capacidad[];
    protected String modelo;
    protected boolean status;

    public Nave(String modelo,int a1, boolean status) {
        this.capacidad = new int [a1];
        this.modelo = modelo;
        this.status = status;
    }

    public int getCapacidad() {
        return capacidad.length;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    
}
