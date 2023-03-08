package examen2.E5;

    
import java.util.ArrayList;
import java.util.List;

public class Celular {
    private List<String> openPrograms = new ArrayList<>();
	private RAM ram;
	private CPU cpu;
	private IStateCel currentState;

	public List<String> getOpenPrograms() {
		return openPrograms;
	}

	public void setOpenPrograms(List<String> openPrograms) {
		this.openPrograms = openPrograms;
	}

	public RAM getRam() {
		return ram;
	}
	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public Celular(String ramName, String cpuName) {
		currentState = new CelularApagada();
		ram = new RAM(ramName);
		cpu = new CPU(cpuName);
	}

	public void show() {
		System.out.println("*********** Celular ***********");
		System.out.println("Cantidad de programas abiertos: " + openPrograms.size());
		ram.show();
		cpu.show();
	}

	public void changeState(IStateCel state) {
		currentState = state;
		currentState.changeComponentsState(this);
	}
}


