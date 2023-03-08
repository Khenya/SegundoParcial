package examen2.E3;

public class Imagen implements Elementos{

	private String fecha;
    public Imagen(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean imagen() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public void showInfo() {
       
        System.out.println("********* Imagen *********");
		System.out.println("Fecha: " + fecha);
    }
    
}
