package examen2.E5;

public class CLient {
    public static void main(String[] args) {
        Celular celular = new Celular("S21", "M14");
        celular.show();

        celular.changeState(new CelularReiniciando());
        celular.show();

        celular.changeState(new CelularPrendida());
        celular.show();

        celular.changeState(new CelularApagada());
        celular.show();
    }
}
