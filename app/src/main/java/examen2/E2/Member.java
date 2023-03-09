package examen2.E2;

public abstract class Member {
    protected ICanalComunicacion canalComunicacion;
    
    

    public Member(ICanalComunicacion canalComunicacion) {
        this.canalComunicacion = canalComunicacion;
    }
    public abstract void send(String msg);
    public abstract void messageReceived(String msg);
}
