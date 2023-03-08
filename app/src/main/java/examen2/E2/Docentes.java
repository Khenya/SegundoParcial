package examen2.E2;

public class Docentes extends Member{
    private int ci;
    

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public Docentes(ICanalComunicacion canalComunicacion, int ci) {
        super(canalComunicacion,"Docente");
        this.ci = ci;
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("mensaje: ");
        this.show();
        
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
