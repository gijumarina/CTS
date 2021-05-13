package ro.ase.csie.cts.dp.command;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
	
	List<AsyncTaskInterface> tasks = new ArrayList<>();
	String name;
	
	public TaskManager(String name) {
		super();
		this.name = name;
	}
	
	public void addAsyncTask(AsyncTaskInterface task) {
		this.tasks.add(task);
	}
	
	//round-robin approach
	public void doNextTask() {
		//determine the task with the biggest priority
		//...try on your own
		if(tasks.size() > 0) {
			AsyncTaskInterface task = tasks.get(0);
			task.startTask();
			tasks.remove(0);
		}
	}
	
}
