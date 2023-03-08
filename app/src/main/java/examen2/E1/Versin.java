package examen2.E1;

public class Versin {
    private Documento documento;

    public void guardarCambio(Documento documento){
        System.out.println("Guardando version");
        System.out.println(documento.getState());
    }
    public Documento revertirCAmbio(Memento memento){
        this.documento=memento.getDocumentoAnterior();
        return documento;
    }
    public Memento createCambio(){
        return new Memento(documento);
    }
}
