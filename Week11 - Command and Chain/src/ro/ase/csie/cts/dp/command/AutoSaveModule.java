package ro.ase.csie.cts.dp.command;

public class AutoSaveModule implements GameModuleInterface {

	int frequency;
		
	public AutoSaveModule(int frequency) {
		super();
		this.frequency = frequency;
	}

	@Override
	public void doTheTask(String details) {
		System.out.println("Autosaving for " + details);
	}

}
