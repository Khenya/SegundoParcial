package examen2.E5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CelularPrendida implements IStateCel {

    @Override
    public void changeComponentsState(Celular celular) {
        System.out.println("Prendiendo la celular...");

		List<String> programasComputadora = new ArrayList<>();
        programasComputadora.add("Archivos");
        programasComputadora.add("Spotify");
        programasComputadora.add("Aple Music");
        programasComputadora.add("Clash Royal");
        programasComputadora.add("WhatsApp");
        programasComputadora.add("Tetris");
        programasComputadora.add("Snapchat");
        programasComputadora.add("Discord");
        programasComputadora.add("Instagram");
        programasComputadora.add("Mensajes");

		Random rnd = new Random();

		int programasParaAbrir = (int) rnd.nextInt(9) + 1;
		double currentCpuConsume = celular.getCpu().getConsumoCPU();
		double currentRamConsume = celular.getRam().getConsumo();

		String openProgram;

		for (int i = 0; i < programasParaAbrir; i++) {
			openProgram = programasComputadora.get(i);
			System.out.println("Abriendo el programa: " + openProgram);
			celular.getOpenPrograms().add(openProgram);
			try {
				Thread.sleep(5000);
				currentCpuConsume += 5;
				celular.getCpu().setConsumoCPU(currentCpuConsume);
				currentRamConsume += 5;
				celular.getRam().setConsumo(currentRamConsume);
				celular.show();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
        System.out.println("Celular encendida");

    }
}
