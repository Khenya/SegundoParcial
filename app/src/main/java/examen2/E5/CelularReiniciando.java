package examen2.E5;

import java.util.List;

public class CelularReiniciando implements IStateCel{

    @Override
    public void changeComponentsState(Celular celular) {
        System.out.println("Reiniciando celular...");

		List<String> openPrograms = celular.getOpenPrograms();

		for (String programa : openPrograms) {
			System.out.println("Cerrando el programa: " + programa);
		}

		celular.getOpenPrograms().clear();
		celular.getCpu().setConsumoCPU(0);
		celular.getRam().setConsumo(0);

		System.out.println("Celular reiniciada");
    }
    
}
