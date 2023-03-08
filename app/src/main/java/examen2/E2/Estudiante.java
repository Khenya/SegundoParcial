package examen2.E2;

public class Estudiante extends Member{
    private int numreoMatricula;
    

    public Estudiante(ICanalComunicacion canalComunicacion, int numreoMatricula) {
        super(canalComunicacion,"Estudiantes");
        this.numreoMatricula = numreoMatricula;
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
        this.show();
        
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
