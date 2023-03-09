package examen2.E2;

public class Estudiante extends Member{
    private int numreoMatricula;
    private String name;
    

    public Estudiante(ICanalComunicacion canalComunicacion, int numreoMatricula, String name) {
        super(canalComunicacion);
        this.numreoMatricula = numreoMatricula;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public int getNumreoMatricula() {
        return numreoMatricula;
    }

    public void setNumreoMatricula(int numreoMatricula) {
        this.numreoMatricula = numreoMatricula;
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println("mensaje: ");
        System.out.println(name);
        System.out.println(numreoMatricula);
        System.out.println(msg);
    }

    @Override
    public void send(String msg) {
        System.out.println("mensaje de Estudiante");
        System.out.println("Con numero de matricula: " + numreoMatricula);
        this.canalComunicacion.send(msg,this);
        System.out.println(msg);
    }
    
}
