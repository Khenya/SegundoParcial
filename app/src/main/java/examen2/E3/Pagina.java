package examen2.E3;

import java.util.ArrayList;
import java.util.List;

public abstract class Pagina {
    private List<Persona>  persona = new ArrayList<>();

    public List<Persona> getPersona() {
        return persona;
    }

    public void setPersona(List<Persona> persona) {
        this.persona = persona;
    }

    
	public abstract void notificaciones(Elementos elementos);
}
 