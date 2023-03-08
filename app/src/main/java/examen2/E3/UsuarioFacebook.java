package examen2.E3;

public class UsuarioFacebook implements Persona{
    private String nombre;
	private boolean imagenes;

	public UsuarioFacebook(String nombre, boolean imagenes) {
		this.nombre = nombre;
		this.imagenes = imagenes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean imagenes() {
		return imagenes;
	}

	public void setImagenes(boolean imagenes) {
		this.imagenes = imagenes;
	}

	@Override
	public void receiveNotificacion(Elementos elementos) {
		System.out.println(nombre);
		elementos.showInfo();
	}
}
