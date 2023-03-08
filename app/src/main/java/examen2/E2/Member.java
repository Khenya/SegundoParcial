package examen2.E2;

public abstract class Member {
    protected ICanalComunicacion canalComunicacion;
    private String nombre;
    private String cargo;
    

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public Member(ICanalComunicacion canalComunicacion, String cargo) {
        this.canalComunicacion = canalComunicacion;
        this.cargo = cargo;
    }
    public void show() {
		System.out.println("********************");
		System.out.println("De: " + nombre);
	}
    public abstract void send(String msg);
    public abstract void messageReceived(String msg);
}
