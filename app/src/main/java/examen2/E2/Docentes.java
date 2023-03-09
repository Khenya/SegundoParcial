package examen2.E2;

public class Docentes extends Member{
    private int ci;
    private String nombre;
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public Docentes(ICanalComunicacion canalComunicacion, String name,int ci) {
        super(canalComunicacion);
        this.ci = ci;
        this.nombre= name;
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("mensaje: ");
        System.out.println(nombre);
        System.out.println(ci);
        System.out.println(msg);
    }

    @Override
    public void send(String msg) {
        System.out.println("mensaje de Docente");
        System.out.println("Con CI: " + ci);
        this.canalComunicacion.send(msg,this);
        System.out.println(msg);
    }
    
}
