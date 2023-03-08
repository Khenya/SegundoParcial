package examen2.E1;

import java.util.ArrayList;
import java.util.List;

public class Drive {
    private List<Memento> versiones = new ArrayList<>();
    public void addVersion(Memento memento){
        versiones.add(memento);
}
public Memento getVersion(int numCambios){
    return versiones.get(versiones.size() - numCambios);
}
}
