package examen2.E1;

public class Memento {
    private Documento documentoAnterior;


    public Documento getDocumentoAnterior() {
        return documentoAnterior;
    }


    public Memento(Documento documentoAnterior) {
        this.documentoAnterior = documentoAnterior;
    }
}
