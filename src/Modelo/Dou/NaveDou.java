
package Modelo.Dou;

import Modelo.Naves.*;
import java.util.ArrayList;

public class NaveDou {
    
    protected ArrayList<Nave> naves;

    public NaveDou() {
        this.naves.add(new NaveC8("NaveA1"));
        this.naves.add(new NaveC8("NaveA2"));
        this.naves.add(new NaveC8("NaveA3"));
        this.naves.add(new NaveC20("NaveB1"));
        this.naves.add(new NaveC20("NaveB2"));
        this.naves.add(new NaveC20("NaveB3"));
    }
    
    
    
}
