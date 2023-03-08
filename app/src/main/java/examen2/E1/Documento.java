package examen2.E1;

public class Documento {
    public Documento(String cambio, String state) {
        this.cambio = cambio;
        this.state = state;
    }
    private String cambio;
    private String state;
    public String getCambio() {
        return cambio;
    }
    public void setCambio(String cambio) {
        this.cambio = cambio;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void show() {
		System.out.println("*********** Documento ***********");
		System.out.println( cambio);
	}
}
