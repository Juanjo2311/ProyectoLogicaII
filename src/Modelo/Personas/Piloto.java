
package Modelo.Personas;

public class Piloto extends Persona{
    
    private boolean disponible;
    
    public Piloto(String name, String lastName, int age, boolean sex, String id, String phone) {
        super(name, lastName, age, sex, id, phone);
        this.disponible = false;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
    public void disponibilidad(){
        this.disponible = !this.disponible;
    }
    
}
