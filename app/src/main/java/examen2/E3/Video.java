package examen2.E3;

public class Video implements Elementos{
    public Video(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    private String nombre;
	private String fecha;
    
    @Override
    public boolean imagen() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void showInfo() {
        System.out.println("********* Video *********");
		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha: " + fecha);
    }
    
}
