package ro.ase.csie.cts.dp.command;

public class TestCommand {

	public static void main(String[] args) {

		TaskManager manager = new TaskManager("Background tasks");
		
		manager.addAsyncTask(new AsyncTask(new AutoSaveModule(5), "finishing current level", 0));
		manager.addAsyncTask(new AsyncTask(new UpdateModule(), "10.5", 0));
		
		System.out.println("Game is running");
		manager.doNextTask();
		System.out.println("Game is running");
		manager.doNextTask();
		System.out.println("Game is running");
		
	}

}
