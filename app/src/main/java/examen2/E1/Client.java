package examen2.E1;

public class Client {
    public static void main(String[] args) {
        Drive drive = new Drive();
        Versin version = new Versin();
        Documento documento;

        documento = new Documento("Introduccion", "1 cambio");
        version.guardarCambio(documento);
        drive.addVersion(version.createCambio());

        documento = new Documento("Historia", "2 cambio");
        version.guardarCambio(documento);
        drive.addVersion(version.createCambio());

        documento = new Documento("Indice", "3 cambio");
        version.guardarCambio(documento);
        drive.addVersion(version.createCambio());

        documento = new Documento("Tablas", "4 cambio");
        version.guardarCambio(documento);
        drive.addVersion(version.createCambio());

        int numeroCambios = 4;

        // contro z
        documento = version.revertirCAmbio(drive.getVersion(numeroCambios-2));
        documento.show();
        documento = version.revertirCAmbio(drive.getVersion(numeroCambios-1));
        documento.show();
        documento = version.revertirCAmbio(drive.getVersion(numeroCambios));
        documento.show();

        // control y
        documento = version.revertirCAmbio(drive.getVersion(numeroCambios - 1));
        documento.show();

        documento = version.revertirCAmbio(drive.getVersion(numeroCambios - 2));
        documento.show();

        documento = version.revertirCAmbio(drive.getVersion(numeroCambios - 3));
        documento.show();
    }
}
