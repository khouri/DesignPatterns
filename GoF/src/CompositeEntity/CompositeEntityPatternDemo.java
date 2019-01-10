/*
 * Uma cadeia de objetos dependentes de um mestre, se o mestre for alterado
 * os escravos tb sao automaticamente.
 * 
 * */

package CompositeEntity;

public class CompositeEntityPatternDemo {

	public static void main(String[] args) {
	
		Client client = new Client();
		client.setData("Test", "Data");
		client.printData();
		client.setData("Second Test", "Data1");
		client.printData();
	}
}