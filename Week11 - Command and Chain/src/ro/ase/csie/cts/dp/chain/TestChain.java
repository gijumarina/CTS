package ro.ase.csie.cts.dp.chain;

public class TestChain {

	public static void main(String[] args) {

		GenericMessageHandler filterModule = new FilterModule("English");
		GenericMessageHandler privateMessageModule = new PrivateMessageModule();
		GenericMessageHandler groupMessageModule = new GroupMessageModule();
		
		filterModule.setNext(privateMessageModule);
		privateMessageModule.setNext(groupMessageModule);
		
		GenericMessageHandler chatServer = filterModule;
		
		chatServer.processMessage(new Message("Hello, John !","@john", 1));
		chatServer.processMessage(new Message("I hate you !", "@John", 1));
		chatServer.processMessage(new Message("Let's join the party!", "@everyone", 1));
		
	}

}
