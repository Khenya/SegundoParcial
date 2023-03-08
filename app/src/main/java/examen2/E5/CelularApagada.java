package examen2.E5;

public class CelularApagada implements IStateCel{

    @Override
    public void changeComponentsState(Celular celular) {
        System.out.println("Apagando celular...");

		celular.getOpenPrograms().clear();
		celular.getCpu().setConsumoCPU(1);
		celular.getRam().setConsumo(1);

		System.out.println("Celular apagada");
    }
    
}
